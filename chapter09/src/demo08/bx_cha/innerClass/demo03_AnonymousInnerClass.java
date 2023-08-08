package demo08.bx_cha.innerClass;

// 匿名内部类

/**
 *
 */
public class demo03_AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

// 外部类
class Outer04 {
    private int n1 = 100;

    public void method() {
        // 基于接口的匿名内部类
        /**
         * tiger的编译类型 IA
         * tiger的运行类型 就是匿名内部类，外部类名$1,即Outer04$1
         *
         * 底层会分配类名Outer04$1
         * class Outer04$1 implements IA{
         *    @Override
         *    public void cry() {
         *      System.out.println("老虎叫唤...");
         *    }
         * }
         * jdk底层在创建匿名内部类后，立马就创建了Outer04$1实例，并把地址返回给了tiger
         * 匿名内部类使用一次，就不能再使用了
         */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        System.out.println("tiger的运行类型" + tiger.getClass());

        // 基于类的匿名内部类
        /**
         * father 编译类型 Father
         * father 运行类型 Outer04$2
         *
         * class Outer04$2 extends Father{
         *      具体代码
         * }
         * jdk底层在创建匿名内部类后，立马就创建了Outer04$1实例，并把地址返回给了father
         */
        Father father = new Father("tom") {
            @Override
            public void test() {
                System.out.println("匿名内部类，重写了test方法");
            }
        };
        father.test();
        System.out.println("father的运行类型" + father.getClass());

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        System.out.println("father的运行类型" + animal.getClass());
        animal.eat();
    }
}

interface IA {
    public void cry();
}

class Father {
    public Father(String name) {

    }

    public void test() {

    }
}

abstract class Animal { //抽象类
    abstract void eat();
}