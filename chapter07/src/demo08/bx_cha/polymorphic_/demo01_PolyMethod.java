package demo08.bx_cha.polymorphic_;

public class demo01_PolyMethod {
    public static void main(String[] args) {
        // 方法重载体现多态
        B b = new B();
        System.out.println(b.sum(10, 20));
        System.out.println(b.sum(10, 20, 30));

        // 方法重写体现多态
        A a = new A();
        a.say();
        b.say();
    }
}

class A {
    public void say() {
        System.out.println("A say()被调用");
    }
}

class B extends A {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("B say()被调用");
    }
}