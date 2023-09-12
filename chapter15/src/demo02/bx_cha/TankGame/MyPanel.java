package demo02.bx_cha.TankGame;


import javax.swing.*;
import java.awt.*;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 绘图区域
 */
public class MyPanel extends JPanel {

    // 定义我自己坦克
    Hero hero = null;

    public MyPanel() {
        // 初始化自己Tank
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 填充矩形
        g.fillRect(0, 0, 1000, 750);

        // 练习画乌龟
        // DrawTurtle(g);

        // 画坦克
        DrawTank(hero.getX(), hero.getY(), g, 0, 0);
        // DrawTank(hero.getX()+60, hero.getY(), g, 0, 1);



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

        // 根据方向 绘制坦克
        /**
         * 0 上
         * 1 下
         * 2 左
         * 3 右
         */
        switch (direction) {
            case 0:
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

            case 1:
            case 2:
            case 3:
            default:
                System.out.println("暂时未处理");

        }

    }

    // 练习画乌龟
    public void DrawTurtle(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillOval(200-10,200+50,30,20);
        g.fillOval(200-10,400-50,30,20);

        g.fillOval(300,200+50,30,20);
        g.fillOval(300,400-50,30,20);

        g.setColor(Color.RED);
        g.fillOval(200,200,120,200);

        g.setColor(Color.GREEN);
        g.fillRect(250,170,20,80);

        g.fillOval(245,150,30,40);

        g.setColor(Color.BLACK);
        g.fillOval(250,160,4,4);
        g.fillOval(263,160,4,4);

        g.setColor(Color.RED);
        g.fillOval(200,200,120,200);
    }

}
