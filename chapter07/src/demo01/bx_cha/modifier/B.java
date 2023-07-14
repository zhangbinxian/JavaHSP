package demo01.bx_cha.modifier;

public class B {
    //B类和A类 同包不同类
    public void func1() {
        A a = new A();
        System.out.println("n1 = " + a.n1);
        System.out.println("n2 = " + a.n2);
        System.out.println("n3 = " + a.n3);

        //n4是A类private所修饰，private，只对本类本身可以访问，不对外公开
        // System.out.println("n1" + a.n4);

        System.out.println();
    }

    //同包不同类时，private修饰的属性和方法不可访问
    public void test() {
        A a = new A();

        a.func1();
        a.func2();
        a.func3();
        // a.func4();
    }
}
