package demo03.bx_cha.codeblock;

public class demo03_CodeBlockDeatil {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    // 静态属性的初始化
    private static int n1 = getN1();
    // 普通属性的初始化
    private int n2 = getN2();

    // 静态代码块
    static {
        System.out.println("A的静态代码块01");
    }

    // 普通代码块
    {
        System.out.println("A的普通代码块01");
    }

    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }

    public A(){
        System.out.println("A的构造器被调用");
    }
}
