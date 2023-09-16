package demo01.bx_cha.TankGame03;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * MyTank
 */
public class Hero extends Tank {

    // 定义一个Shot对象，表示一个射击线程
    Shot shot = null;

    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
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
        // 启动Shot线程

        Thread thread = new Thread(shot);
        thread.start();
    }


}
