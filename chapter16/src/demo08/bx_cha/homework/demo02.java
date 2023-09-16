package demo08.bx_cha.homework;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 两个人在同一张卡里面取钱，每次取出1000，不能超取
 */
public class demo02 {
    public static void main(String[] args) {

        Card card = new Card();

        Thread thread1 = new Thread(card);
        thread1.setName("user1");
        Thread thread2 = new Thread(card);
        thread2.setName("user2");

        thread1.start();
        thread2.start();
    }
}

//编程取款的线程
//1.因为这里涉及到多个线程共享资源，所以我们使用实现Runnable方式
//2. 每次取出 1000
class Card implements Runnable {

    private double money = 12345;
    private Object lock = new Object();

    @Override
    public void run() {
        while (true) {

            // 取完钱之后，休息50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                //解读
                //1. 这里使用 synchronized 实现了线程同步
                //2. 当多个线程执行到这里时，就会去争夺 this对象锁
                //3. 哪个线程争夺到(获取)this对象锁，就执行 synchronized 代码块, 执行完后，会释放this对象锁
                //4. 争夺不到this对象锁，就blocked ，准备继续争夺
                //5. this对象锁是非公平锁.
                if (money < 1000) {
                    System.out.println("money 不足");
                    break;
                } else {
                    money -= 1000;
                    System.out.println(Thread.currentThread().getName() + "取出了1000块, " + "当前余额: " + money);
                }
                // 等待500毫秒
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}