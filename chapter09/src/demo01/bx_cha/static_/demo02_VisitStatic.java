package demo01.bx_cha.static_;

public class demo02_VisitStatic {
    public static void main(String[] args) {
        // 访问类变量
        // - 类名.类变量名
        // - 对象名.类变量名
        System.out.println(A.name);

        A a = new A();
        System.out.println(a.name);
    }
}

class A {
    public static String name = "zbx";
}