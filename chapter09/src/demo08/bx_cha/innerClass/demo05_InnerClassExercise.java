package demo08.bx_cha.innerClass;

public class demo05_InnerClassExercise {
    public static void main(String[] args) {

        // 当做实参直接传递，简洁高效
        f1(new IAA() {
            @Override
            public void show() {
                System.out.println("show()...");
            }
        });

        // 传统写法
        /**
         * 先写一个类 实现 接口IAA
         * 再调用
         */

        f1(new Pic());
    }

    // 静态方法，形参为接口IAA
    public static void f1(IAA aa) {
        aa.show();

    }
}

interface IAA {
    void show();
}

class Pic implements IAA {
    @Override
    public void show() {
        System.out.println("show。。。");
    }
}