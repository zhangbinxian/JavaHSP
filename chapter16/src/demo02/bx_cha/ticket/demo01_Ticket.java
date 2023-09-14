package demo02.bx_cha.ticket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 使用多线程，模拟三个窗口同时售票 100 张
 */
public class demo01_Ticket {
    public static void main(String[] args) {

        // SellTicket01 sellTicket01 = new SellTicket01();
        // SellTicket01 sellTicket02 = new SellTicket01();
        // SellTicket01 sellTicket03 = new SellTicket01();
        //
        // //这里我们会出现超卖..
        // sellTicket01.start();
        // sellTicket02.start();
        // sellTicket03.start();

        SellTicket02 sellTicket02 = new SellTicket02();

        Thread thread1 = new Thread(sellTicket02);
        Thread thread2 = new Thread(sellTicket02);
        Thread thread3 = new Thread(sellTicket02);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class SellTicket01 extends Thread {

    //static 该类的所有对象实例共享
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum < 0) {
                System.out.println("Over");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" +
                    ",剩余票数" + (--ticketNum));
        }

    }
}

class SellTicket02 implements Runnable {
    //static 该类的所有对象实例共享
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum < 0) {
                System.out.println("Over");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" +
                    ",剩余票数" + (--ticketNum));
        }

    }
}