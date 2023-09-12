package demo01.bx_cha.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author bx_cha
 * @version 1.0
 */

/**
 * 画一个圆
 */

//JFrame 对应窗口,可以理解成是一个画框
public class demo01_DrawCircle extends JFrame {

    // 定义一个面板
    private MyPanel myPanel = null;

    public static void main(String[] args) {


        new demo01_DrawCircle();
        System.out.println("程序退出");

    }

    // 构造器
    public demo01_DrawCircle() {
        // 初始化面板
        myPanel = new MyPanel();

        // 把面板放入到窗口(画板)
        this.add(myPanel);

        // 设置窗口大小
        this.setSize(800, 600);

        // 可以显示
        this.setVisible(true);
        // 点击窗口的小叉，程序完全退出
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

// 定义一个MyPanel(画板),继承JPanel类，话图形
class MyPanel extends JPanel {

    //1. MyPanel 对象就是一个画板
    //2. Graphics g 把 g 理解成一支画笔
    //3. Graphics 提供了很多绘图的方法

    @Override
    // 绘图方法
    public void paint(Graphics g) {

        //调用父类的方法完成初始化
        super.paint(g);
        System.out.println("paint 方法被调用了~");

        // 画圆(x,y)是左上角的坐标
        g.drawOval(50, 50, 50, 50);

        // 画直线(起点，终点)
        g.drawLine(50, 150, 200, 150);

        // 画矩形边框(x,y)是左上角的坐标
        g.drawRect(50, 200, 100, 100);

        // 画圆形边框
        g.drawOval(50, 325, 100, 50);

        // 设置画笔的颜色
        // 填充矩形
        g.setColor(Color.GREEN);
        g.fillRect(200, 50, 50, 50);

        // 填充椭圆
        g.setColor(Color.YELLOW);
        g.fillOval(200, 225, 100, 50);

        // 画图片
        // 获取图片资源(图片资源在out/chapter15/路径)
        // MyPanel.class.getResource(path),用MyPanel,如果Panel会报错
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.png"));
        g.drawImage(image, 200, 300, 175, 221, this);

        // 画字符串
        g.setColor(Color.BLACK);
        // 设置画笔的字体
        g.setFont(new Font("仿宋", Font.BOLD, 30));
        //(x,y)是字符串的左下角
        g.drawString("Java是世界上最后的语言", 300, 100);

    }
}