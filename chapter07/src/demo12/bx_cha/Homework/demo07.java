package demo12.bx_cha.Homework;

public class demo07 {

    //test,demo,rose,iack
    //john,jack

}

class Test {
    String name = "rose";

    public Test() {
        System.out.println("test");
    }

    public Test(String name) {
        this.name = name;
    }
}

class Demo extends Test {
    String name = "jack";

    public Demo() {
        super();
        System.out.println("demo");
    }

    public Demo(String s) {
        super(s);

    }

    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Demo().test();
        System.out.println();
        new Demo("john").test();
    }
}