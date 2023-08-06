package demo05.bx_cha.final_;

public class demo06_finalDetail {

    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}

final class AAA {
    // 一般来说,如果一个类已经是final类,则就没必要再将方法修饰成final
    // public final void hi(){}
}

// final和static往往搭配使用,效率更高,不会导致类加载,底层编译器做了优化处理
class BBB {
    public final static int num = 10000;
    static {
        System.out.println("BBB的静态代码块被执行");
    }
}
