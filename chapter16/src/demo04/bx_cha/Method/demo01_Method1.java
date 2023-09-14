package demo04.bx_cha.Method;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Method1 {
    public static void main(String[] args) throws InterruptedException {

        T t = new T();
        t.setName("thread1");

        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        //主线程打印5 hi ,然后我就中断 子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }

        System.out.println(t.getName() + " 线程的优先级 =" + t.getPriority());//1

        t.interrupt();//当执行到这里，就会中断 t线程的休眠.


    }
}

class T extends Thread {
    @Override
    public void run() {

        while (true) {


            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " hi " + i);
            }

            try {
                System.out.println(Thread.currentThread().getName() + " sleep");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当该线程执行到一个interrupt 方法时，就会catch 一个 异常, 可以加入自己的业务代码
                //InterruptedException 是捕获到一个中断异常.
                System.out.println(Thread.currentThread().getName() + "被 interrupt(中断)");
            }
        }
    }
}