package demo02.bx_cha.TankGame;

import javax.swing.*;

/**
 * @author bx_cha
 * @version 1.0
 */
public class TankGame extends JFrame {

    // 定义Mypanel
    MyPanel myPanel = null;

    public static void main(String[] args) {
        TankGame tankGame = new TankGame();


    }

    public TankGame() {
        myPanel = new MyPanel();

        this.add(myPanel);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
