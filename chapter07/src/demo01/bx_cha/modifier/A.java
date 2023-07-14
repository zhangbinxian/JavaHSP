package demo01.bx_cha.modifier;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    //该方法可以访问到四个属性
    public void func1() {
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);

        System.out.println();
    }

    protected void func2() {

    }

    void func3() {

    }

    private void func4() {

    }

    //同类，可以访问到四种访问修饰符修饰的属性即方法
    public void test() {
        func1();
        func2();
        func3();
        func4();
    }

}
