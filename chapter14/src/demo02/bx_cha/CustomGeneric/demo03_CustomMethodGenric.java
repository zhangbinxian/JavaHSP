package demo02.bx_cha.CustomGeneric;

import java.util.ArrayList;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_CustomMethodGenric {
    public static void main(String[] args) {
        Car car = new Car();

        // 当调用方法时,传入参数(这里会装箱),编译器,就会确定类型
        car.fly("car1", 100);
        System.out.println();
        car.fly(100, 200.01);


        /**
         * class Fish<T, R>
         * public <K> void hello(R r, K k)
         */
        System.out.println("=======================");
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 123.4);
    }
}

//泛型方法，可以定义在普通类中, 也可以定义在泛型类中
class Car { // 普通类

    // 普通方法
    public void run() {

    }

    //泛型方法
    public <T, R> void fly(T t, R r) {
        /**
         * 1. <T,R>就是泛型
         * 2. 是提供给fly使用的
         */
        System.out.println(t.getClass());
        System.out.println(r.getClass());

    }
}

class Fish<T, R> {//泛型类

    // 普通方法
    public void run() {

    }

    //泛型方法
    public <U, M> void eat(U u, M m) {

    }

    // hi()该方法,使用了泛型,而不是泛型方法
    // 因为在public之后没有<泛型>
    public void hi(T t) {

    }

    //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
    public <K> void hello(R r, K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}