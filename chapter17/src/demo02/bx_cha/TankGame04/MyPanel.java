package demo02.bx_cha.TankGame04;


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

    // 存放炸弹,当子弹击中时候，加入一个Boom到booms
    Vector<Boom> booms = new Vector<>();
    // 定义三张图片，显示boom效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        // 初始化自己Tank
        hero = new Hero(400, 200);
        hero.setSpeed(5);

        // 初始化敌人坦克
        for (int i = 0; i < enemyTankSize; i++) {
            Enemy enemy = new Enemy((100 * (i + 1)), 100);
            enemy.setDirect(1);

            //启动敌人线程
            Thread thread2 = new Thread(enemy);
            thread2.start();

            // 加入一颗子弹
            Shot shot = new Shot(enemy.getX() + 20, enemy.getY() + 60, enemy.getDirect());
            // 加入到enemy的Vector
            enemy.shots.add(shot);
            // 启动
            Thread thread = new Thread(shot);
            thread.start();

            enemies.add(enemy);


        }
        // 初始化图片
        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_3.gif"));

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 填充矩形
        g.fillRect(0, 0, 1000, 750);

        // 画坦克
        if (hero != null && hero.isLive) {
            DrawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
        // 画子弹
        if (hero.shot != null && hero.shot.isLive != false) {
            DrawShotSelf(g);
        }

        // // 讲hero的子弹集合 shots，遍历取出绘制
        // for (int i = 0; i < hero.shots.size(); i++) {
        //     Shot shot = hero.shots.get(i);
        //     if (shot != null && shot.isLive == true) {
        //         g.drawOval(shot.x, shot.y, 3, 3);
        //     } else {
        //         hero.shots.remove(shot);
        //     }
        // }

        // 如果booms当中有对象，就画
        for (int i = 0; i < booms.size(); i++) {
            Boom boom = booms.get(i);
            if (boom.live > 6) {
                g.drawImage(image1, boom.x, boom.y, 100, 100, this);
            } else if (boom.live > 3) {
                g.drawImage(image2, boom.x, boom.y, 100, 100, this);
            } else {
                g.drawImage(image3, boom.x, boom.y, 100, 100, this);
            }
            boom.lifeDown();
            if (boom.live == 0) {
                booms.remove(boom);
            }

        }

        // 画敌人坦克
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemyTank = enemies.get(i);

            if (enemyTank.isLive == true) {

                DrawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);

                // 画子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    // 取出子弹
                    Shot shot = enemyTank.shots.get(j);

                    if (shot.isLive) {
                        DrawShotEnemy(shot, g);
                    } else {
                        enemyTank.shots.remove(shot);
                    }
                }
            }

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

    // 画自己子弹
    public void DrawShotSelf(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(hero.shot.x, hero.shot.y, 3, 3);
    }

    // 画敌人子弹
    public void DrawShotEnemy(Shot shot, Graphics g) {
        g.setColor(Color.red);
        g.fillOval(shot.x, shot.y, 3, 3);
    }

    public void hitEnemyTank() {

//        //遍历我们的子弹
//        for(int j = 0;j < hero.shots.size();j++) {
//            Shot shot = hero.shots.get(j);
//            //判断是否击中了敌人坦克
//            if (shot != null && hero.shot.isLive) {//当我的子弹还存活
//
//                //遍历敌人所有的坦克
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(hero.shot, enemyTank);
//                }
//
//            }
//        }

        //单颗子弹。
        if (hero.shot != null && hero.shot.isLive) {//当我的子弹还存活

            //遍历敌人所有的坦克
            for (int i = 0; i < enemies.size(); i++) {
                Enemy enemy = enemies.get(i);
                hitTank(hero.shot, enemy);
            }

        }

    }

    // 判断我方子弹是否击中了坦克
    public void hitHero() {
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            for (int j = 0; j < enemy.shots.size(); j++) {
                Shot shot = enemy.shots.get(j);
                if (hero.isLive == true && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }

    }

    // 判断我方子弹是否击中了坦克
    public void hitTank(Shot s, Tank enemy) {

        //        //遍历我们的子弹
//        for(int j = 0;j < hero.shots.size();j++) {
//            Shot shot = hero.shots.get(j);
//            //判断是否击中了敌人坦克
//            if (shot != null && hero.shot.isLive) {//当我的子弹还存活
//
//                //遍历敌人所有的坦克
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(hero.shot, enemyTank);
//                }
//
//            }
//        }


        switch (enemy.getDirect()) {
            case 0:
            case 1:
                if (s.x > enemy.getX() && s.x < enemy.getX() + 40 &&
                        s.y > enemy.getY() && s.y < enemy.getY() + 60) {
                    s.isLive = false;
                    enemy.isLive = false;
                    // 当我们子弹击中敌人之后，讲enemy从Vector当中去掉
                    enemies.remove(enemy);
                    // 创建Boom对象，加入到booms
                    Boom boom = new Boom(enemy.getX(), enemy.getY());
                    booms.add(boom);
                }
                break;

            case 2:
            case 3:
                if (s.x > enemy.getX() && s.x < enemy.getX() + 60 &&
                        s.y > enemy.getY() && s.y < enemy.getY() + 40) {
                    s.isLive = false;
                    enemy.isLive = false;
                    // 当我们子弹击中敌人之后，讲enemy从Vector当中去掉
                    enemies.remove(enemy);
                    // 创建Boom对象，加入到booms
                    Boom boom = new Boom(enemy.getX(), enemy.getY());
                    booms.add(boom);
                }
                break;
        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                hero.setDirect(0);
                if (hero.getY() > 0) {
                    hero.moveUp();
                }
                break;
            case KeyEvent.VK_S:
                hero.setDirect(1);
                if (hero.getY() + 60 < 750) {
                    hero.moveDown();
                }
                break;
            case KeyEvent.VK_A:
                hero.setDirect(2);
                if (hero.getX() > 0) {
                    hero.moveLeft();
                }
                break;

            case KeyEvent.VK_D:
                hero.setDirect(3);
                if (hero.getX() + 60 < 1000) {
                    hero.moveRight();
                }
                break;
            // 发射子弹
            case KeyEvent.VK_J:
                // 调用Hero的shotEnemyTank()方法
                // 发射一颗子弹
                // if (hero.shot == null || !hero.shot.isLive) {
                //     hero.shotEnemyTank();
                // }
                hero.shotEnemyTank();

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
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 判断子弹是否击中
            hitEnemyTank();
            hitHero();
            this.repaint();
        }
    }
}
