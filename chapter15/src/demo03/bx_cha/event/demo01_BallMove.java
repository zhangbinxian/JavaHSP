package demo03.bx_cha.event;

/**
 * @author bx_cha
 * @version 1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 事件监听
 * 小球移动
 */
public class demo01_BallMove extends JFrame {

    private MyPanel myPanel = null;

    public static void main(String[] args) {
        demo01_BallMove ballMove = new demo01_BallMove();
    }

    public demo01_BallMove() {
        myPanel = new MyPanel();

        this.add(myPanel);

        this.setSize(400, 300);

        // 窗口JFrame对象可以监听键盘事件，即所以监听到面板发生的键盘事件
        this.addKeyListener(myPanel);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

// 画板 画小球
// KeyListener 监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    // 小球左上角坐标
    int x = 10;
    int y = 230;

    // 移动步长
    int step = 5;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x, y, 20, 20);

    }

    /**
     * 有字符输出时，该方法就会被触发
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 当某个键被按下，该方法就会被触发
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

        // System.out.println((char) e.getKeyCode() + "被按下");

        // 根据用户按下的键，来处理小球的移动
        // w a s d
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                y -= step;
                this.repaint();
                break;

            case KeyEvent.VK_S:
                y += step;
                this.repaint();
                break;

            case KeyEvent.VK_A:
                x -= step;
                this.repaint();
                break;

            case KeyEvent.VK_D:
                x += step;
                this.repaint();
                break;
            default:
                System.out.println("什么也不做");
        }

    }

    /**
     * 当某个键被松开了，该方法就会被触发
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {
    }
}