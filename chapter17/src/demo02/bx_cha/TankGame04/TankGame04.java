package demo02.bx_cha.TankGame04;

import javax.swing.*;

/**
 * @author bx_cha
 * @version 1.0
 */
public class TankGame04 extends JFrame {

    // 定义Mypanel
    MyPanel myPanel = null;

    public static void main(String[] args) {
        TankGame04 tankGame = new TankGame04();


    }

    public TankGame04() {
        myPanel = new MyPanel();
        // 讲myPanel放入到Thread,并启动
        Thread thread = new Thread(myPanel);
        thread.start();

        this.add(myPanel);
        this.setSize(1000, 750);
        // 让JFrame，监听myPanel的键盘事件
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
