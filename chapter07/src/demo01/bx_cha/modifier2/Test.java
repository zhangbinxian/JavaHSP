package demo01.bx_cha.modifier2;

import demo01.bx_cha.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("n1 = " + a.n1);

        //在不同包下，只能访问到public修饰的属性或方法
        // System.out.println("n2 = " + a.n2);  //a.n2 protected
        // System.out.println("n3 = " + a.n3);  //a.n3 默认
        // System.out.println("n4 = " + a.n4);  //a.n4 private

        //在不同包下，只能访问到public修饰的属性或方法
        a.func1();
        // a.func2();
        // a.func3();
        // a.func4();

    }
}
