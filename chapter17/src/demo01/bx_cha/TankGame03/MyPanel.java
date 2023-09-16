package demo01.bx_cha.TankGame03;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 绘图区域
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {

    // 定义我自己坦克
    Hero hero = null;

    // 定义敌人坦克
    int enemyTankSize = 3;
    Vector<Enemy> enemies = new Vector<>();

    public MyPanel() {
        // 初始化自己Tank
        hero = new Hero(400, 200);
        hero.setSpeed(5);

        // 初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            Enemy enemy = new Enemy((100 * (i + 1)), 100);
            enemy.setDirect(1);

            enemies.add(enemy);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 填充矩形
        g.fillRect(0, 0, 1000, 750);

        // 画坦克
        DrawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);

        // 画子弹
        if (hero.shot != null && hero.shot.isLive != false) {
            DrawShot(g);
        }


        // 画敌人坦克
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemyTank = enemies.get(i);
            DrawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }


    }

    // 编写方法，画坦克

    /**
     * @param x         左上角x坐标
     * @param y         左上角y坐标
     * @param g         画笔 g
     * @param direction 坦克方向
     * @param type      坦克类型
     */
    public void DrawTank(int x, int y, Graphics g, int direction, int type) {

        // 判断type,0 self,1 enemy,设置不同的颜色
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.orange);
                break;
        }

        // 根据方向 绘制对应的坦克
        /**
         * 0 上
         * 1 下
         * 2 左
         * 3 右
         */
        switch (direction) {
            case 0:  // up
                // 左边矩形轮子
                g.fill3DRect(x, y, 10, 60, false);
                // 右边矩形轮子
                g.fill3DRect(x + 30, y, 10, 60, false);
                // 中间矩形
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                // 圆盖
                g.fillOval(x + 10, y + 20, 20, 20);
                // 炮筒
                g.drawLine(x + 20, y + 20, x + 20, y);
                break;
            case 1: // down
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 2:   //left
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            case 3:// right
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            default:
                System.out.println("暂时未处理");

        }

    }

    // 画子弹
    public void DrawShot(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(hero.shot.x, hero.shot.y, 3, 3);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                hero.setDirect(0);
                hero.moveUp();
                this.repaint();
                break;

            case KeyEvent.VK_S:
                hero.setDirect(1);
                hero.moveDown();
                this.repaint();
                break;

            case KeyEvent.VK_A:
                hero.setDirect(2);
                hero.moveLeft();
                this.repaint();
                break;

            case KeyEvent.VK_D:
                hero.setDirect(3);
                hero.moveRight();
                this.repaint();
                break;

            // 发射子弹
            case KeyEvent.VK_J:
                // 调用Hero的shotEnemyTank()方法
                hero.shotEnemyTank();
                this.repaint();
                break;
            default:
                System.out.println("什么也不做");
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        // 每隔100ms，repaint()
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.repaint();
        }
    }
}
