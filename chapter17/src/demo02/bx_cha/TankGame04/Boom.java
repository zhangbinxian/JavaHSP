package demo02.bx_cha.TankGame04;

/**
 * @author bx_cha
 * @version 1.0
 */
public class Boom {
    int x;
    int y;

    // 爆炸的生命周期,血量
    int live = 6;

    boolean isLive = true;

    public Boom(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void lifeDown() {
        if (live > 0) {
            live--;
        } else {
            isLive = false;
        }
    }
}
