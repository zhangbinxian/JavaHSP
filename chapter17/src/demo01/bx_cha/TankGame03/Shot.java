package demo01.bx_cha.TankGame03;

/**
 * @author bx_cha
 * @version 1.0
 */
public class Shot implements Runnable {

    //子弹的坐标，方向,速度
    int x;
    int y;
    int direct = 0;
    int speed = 2;

    // 记录子弹是否存活
    boolean isLive=true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 根据方向，修改x,y坐标
            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    y += speed;
                    break;
                case 2:
                    x -= speed;
                    break;
                case 3:
                    x += speed;
                    break;
            }
            System.out.println("x=" + x + ",y=" + y);
            // 子弹的销毁,不在正常范围之内
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive=false;
                break;
            }
        }
    }
}
