package demo08.bx_cha.innerClass;

// 局部内部类

/**
 * 可以直接访问外部类的所有成员，包括私有private
 * 不能添加访问修饰符，因为它是一个局部变量。但可以使用final修饰
 * 作用域 仅仅在定义它的方法或者代码块中
 * 局部内部类.访问--->外部类的成员 (直接访问)
 * 外部类.访问--->局部内部类的成员 (创建对象，再访问，且必须在作用域内)
 * 外部其他类.不能访问--->局部内部类，(因为局部内部类的地位是一个局部变量)
 * 如果外部类和局部内部类的成员重名，默认遵循就近原则，如果要访问外部类的成员，则可以使用(外部类名.this成员)去访问
 */
public class demo02_localInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.func1();
    }
}


class Outer02 {
    private int n1 = 100;

    public void func2() {
        System.out.println("外部类的func2()");
    }

    // 方法
    public void func1() {
        // 局部内部类,可以直接访问私有属性
        final class Inner02 {
            private int n1 = 200;
            public void f1() {
                // 局部内部类.访问--->外部类的成员 (直接访问)
                System.out.println("外部类的n1,Outer02.this.n1=" + Outer02.this.n1);
                System.out.println("内部类的n1,n1=" + n1);
                func2();
            }
        }
        // 外部类.访问--->局部内部类的成员 (创建对象，再访问，且必须在作用域内)
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}