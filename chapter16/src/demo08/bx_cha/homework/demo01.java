package demo08.bx_cha.homework;

import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 创建两个线程，
 * 线程A随机输出100以内的整数
 * 线程B直到在键盘读到Q
 */
public class demo01 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B(a);

        a.start();
        b.start();

    }
}

class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {

        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A线程退出");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B extends Thread {

    private A a;
    Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("输入一个Q，退出");
            char Q = scanner.next().toUpperCase().charAt(0);

            if (Q == 'Q') {
                a.setLoop(false);
                System.out.println("B线程退出");
                break;
            }
        }
    }
}