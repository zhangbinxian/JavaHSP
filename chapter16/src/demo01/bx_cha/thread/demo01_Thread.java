package demo01.bx_cha.thread;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Thread {
    public static void main(String[] args) throws InterruptedException {

        //创建对象，可以当作线程使用
        Cat cat = new Cat();

        //起点线程
        cat.start();

        //当main线程起点一个子线程Thread-0，主线程不会阻塞，会继续执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程=" + i);
            Thread.sleep(500);
        }


    }
}


//1. 当一个类继承了 Thread 类， 该类就可以当做线程使用
//2. 我们会重写 run 方法，写上自己的业务代码
//3. run Thread 类 实现了 Runnable 接口的 run 方法

/**
 * @Override public void run() {
 * if (target != null) {
 * target.run();
 * }
 * }
 */
class Cat extends Thread {

    int times = 0;

    // 写自己的逻辑实现代码
    @Override
    public void run() {

        while (true) {
            System.out.println("hello " + times + " 线程名=" + Thread.currentThread().getName());
            try {
                // 休眠1秒(1000ms)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            times++;

            // 次数到10时，退出while循环，线程也就退出了
            if (times == 10) {
                break;
            }
        }
    }
}