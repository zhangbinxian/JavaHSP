package demo02.bx_cha.annotation;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_Deprecated {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

// Deprecated修饰类和方法，表示该类已经过时，不推荐使用，但仍可以使用
@Deprecated
class A {

    public int n1 = 10;
    @Deprecated
    public void hi() {
        System.out.println("hi");
    }
}
