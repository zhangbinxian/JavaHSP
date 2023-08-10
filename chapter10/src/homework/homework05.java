package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String NAME = "aaa";

    public void f1() {
        class B {
            private final static String NAME = "bbb";

            public void show() {
                System.out.println(A.this.NAME + "\t" + NAME);
            }
        }

        B b = new B();
        b.show();
    }

}