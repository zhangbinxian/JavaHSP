package demo02.bx_cha.TankGame04;


/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 坦克父类
 */
public class Tank {

    private int x;
    private int y;
    private int direct;//坦克方向wsad 0123
    private int speed = 3;//坦克速度

    boolean isLive = true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y -= speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Tank{x = " + x + ", y = " + y + "}";
    }
}
