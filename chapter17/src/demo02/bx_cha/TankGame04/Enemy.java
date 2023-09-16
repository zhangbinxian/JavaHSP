package demo02.bx_cha.TankGame04;

import java.util.Vector;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 敌人坦克
 */
public class Enemy extends Tank implements Runnable {

    Vector<Shot> shots = new Vector();

    boolean isLive = true;

    public Enemy(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            //这里我们判断如果shots size() =3, 创建一颗子弹，放入到
            //shots集合，并启动
            if (isLive && shots.size() < 3) {
                Shot s = null;
                //判断坦克的方向，创建对应的子弹
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 20, getY() + 60, 1);
                        break;
                    case 2: //向左
                        s = new Shot(getX(), getY() + 20, 2);
                        break;
                    case 3://向右
                        s = new Shot(getX() + 60, getY() + 20, 3);
                        break;
                }
                shots.add(s);
                //启动
                new Thread(s).start();

            }

            switch (getDirect()) {
                case 0:  //向上
                    //让坦克保持一个方向，走30步
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:  //向xia
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:  //向左
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:  //向右
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        //休眠50毫秒
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            //然后随机的改变坦克方向 0-3
            setDirect((int) (Math.random() * 4));
            //写并发程序，一定要考虑清楚，该线程什么时候结束
            if (!isLive) {
                break; //退出线程.
            }
        }
    }
}
