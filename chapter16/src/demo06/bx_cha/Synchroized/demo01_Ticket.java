package demo06.bx_cha.Synchroized;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 使用多线程，模拟三个窗口同时售票 100 张
 */
public class demo01_Ticket {
    public static void main(String[] args) {


        SellTicket04 sellTicket04 = new SellTicket04();

        Thread thread1 = new Thread(sellTicket04);
        Thread thread2 = new Thread(sellTicket04);
        Thread thread3 = new Thread(sellTicket04);


        thread1.start();
        thread2.start();
        thread3.start();



    }
}

//实现接口方式, 使用 synchronized 实现线程同步
class SellTicket04 implements Runnable {
    //static 该类的所有对象实例共享
    private int ticketNum = 100;
    private boolean loop = true;
    Object object=new Object();



    //同步方法（静态的）的锁为当前类本身
    //1. public synchronized static void m1() {} 锁是加在 SellTicket04.class
    public synchronized static void m1(){


    }
    public static void m2(){
        synchronized (SellTicket04.class){
            System.out.println("m2");
        }

    }

    //1. public synchronized void sell() {} 就是一个同步方法
    //2. 这时锁在 this 对象
    //3. 也可以在代码块上写 synchronize ,同步代码块, 互斥锁还是在 this 对象
    public synchronized void sell() {
        if (ticketNum <= 0) {
            System.out.println("Over");
            loop = false;
            return;
        }

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" +
                ",剩余票数" + (--ticketNum));
    }

    // 也可以在代码块上写 synchronize ,同步代码块, 互斥锁还是在 this 对象
    public void sell2() {
        // synchronized (this){
        //     // 实现代码
        // }
        synchronized (object) {
            if (ticketNum <= 0) {
                System.out.println("Over");
                loop = false;
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" +
                    ",剩余票数" + (--ticketNum));
        }

    }


    @Override
    public void run() {
        while (loop) {
            // sell();

            sell2();
        }
    }
}