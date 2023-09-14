package demo01.bx_cha.thread;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_Thread {
    public static void main(String[] args) {

        // Dog dog = new Dog();
        // // dog.start();//这里不能调用start
        //
        // Thread thread = new Thread(dog);
        // thread.start();


        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();



    }
}

class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hi " + count + " 线程名=" + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;


            if (count == 10) {
                break;
            }
        }

    }
}

class Animal {
}

class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("静态代理，模拟实现Thread类");
    }
}

//线程代理类 , 模拟了一个极简的 Thread 类
class ThreadProxy implements Runnable {//可以把 Proxy 类当做 ThreadProxy

    private Runnable target = null;//属性，类型是 Runnable

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法时真正实现多线程方法
    }

    public void start0() {
        run();
    }
}
