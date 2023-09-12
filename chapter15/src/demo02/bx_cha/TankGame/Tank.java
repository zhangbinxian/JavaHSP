package demo02.bx_cha.TankGame;


/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 坦克父类
 */
public class Tank {

    private int x;
    private int y;


    public Tank() {
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 获取
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Tank{x = " + x + ", y = " + y + "}";
    }
}
