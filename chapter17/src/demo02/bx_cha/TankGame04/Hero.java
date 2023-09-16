package demo02.bx_cha.TankGame04;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * MyTank
 */
public class Hero extends Tank {

    // 定义一个Shot对象，表示一个射击线程
    Shot shot = null;
    //可以发射多颗子弹
    // Vector<Shot> shots = new Vector<>();



    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
        //发多颗子弹怎么办, 控制在我们的面板上，最多只有5颗
        // if (shots.size() == 5) {
        //     return;
        // }
        switch (getDirect()) {
            case 0:
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX() + 20, getY() + 60, 1);
                break;
            case 2:
                shot = new Shot(getX(), getY() + 20, 2);
                break;
            case 3:
                shot = new Shot(getX() + 60, getY() + 20, 3);
                break;
        }

        // shots.add(shot);
        // 启动Shot线程

        Thread thread = new Thread(shot);
        thread.start();
    }


}
