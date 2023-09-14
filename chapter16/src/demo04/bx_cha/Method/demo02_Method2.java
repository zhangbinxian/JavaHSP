package demo04.bx_cha.Method;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_Method2 {
    public static void main(String[] args) throws InterruptedException {

        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("hello " + i);

            if (i == 5) {
                //join, 线程插队
                t2.join();

                // Thread.yield();//礼让，不一定成功
            }
        }


    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi " + i);
        }
    }
}