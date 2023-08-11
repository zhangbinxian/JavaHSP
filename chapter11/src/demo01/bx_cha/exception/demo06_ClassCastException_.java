package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo06_ClassCastException_ {
    public static void main(String[] args) {

        // ClassCastException 类型转换异常,当试图将对象强制转换为不是实例的子类时，抛出该异常

        A a = new B(); //向上转型
        B b = (B) a;//向下转型，这里是 OK
        C c = (C) a;//这里抛出 ClassCastException
    }
}

class A {
}

class B extends A {
}

class C extends A {
}