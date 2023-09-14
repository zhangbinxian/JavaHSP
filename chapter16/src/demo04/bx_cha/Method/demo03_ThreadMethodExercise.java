package demo04.bx_cha.Method;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {

        T3 t3 = new T3();
        Thread thread = new Thread(t3);


        for (int i = 0; i < 20; i++) {
            System.out.println("hello " + i);

            Thread.sleep(1000);
            if (i == 5) {
                thread.start();
                thread.join();
            }
        }

    }
}

class T3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("hi " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}