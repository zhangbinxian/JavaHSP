package demo08.bx_cha.innerClass;

public class demo01_innerClass {
    public static void main(String[] args) {

    }
}

class Outer {

    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void func1() {
        System.out.println("func1");
    }

    {
        System.out.println("代码块");
    }

    class Inner {

    }
}