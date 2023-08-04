package demo03.bx_cha.codeblock;

public class demo05_CodeBlockDeatilAllInOne {
    public static void main(String[] args) {
        // 父类静态(代码块，属性初始化)--->子类静态(代码块，属性初始化)--->
        // 父类普通(代码块，属性初始化)--->父类构造器--->
        // 子类普通(代码块，属性初始化)--->子类构造器

        new B0();
        //getValue01 A0的静态代码块 getValue03 B0的静态代码块
        // A0的普通代码块 getValue02 A0的构造器
        // getValue04 B0的普通代码块 B0的构造器
        System.out.println("=================new 2(多个)对象，静态只加载一次====================");
        new B0();

        // A0的普通代码块 getValue02 A0的构造器
        // getValue04 B0的普通代码块 B0的构造器
    }
}

class A0 {
    private static int n1 = getValue01();

    static {
        System.out.println("A0的静态代码块");
    }

    {
        System.out.println("A0的普通代码块");
    }

    public int n2 = getValue02();

    public static int getValue01() {
        System.out.println("getValue01");
        return 10;
    }

    public int getValue02() {
        System.out.println("getValue02");
        return 20;
    }

    public A0() {
        System.out.println("A0的构造器");
    }
}

class B0 extends A0 {
    private static int n3 = getValue03();

    static {
        System.out.println("B0的静态代码块");
    }

    public int n4 = getValue04();

    {
        System.out.println("B0的普通代码块");
    }


    public static int getValue03() {
        System.out.println("getValue03");
        return 30;
    }

    public int getValue04() {
        System.out.println("getValue04");
        return 40;
    }

    public B0() {
        System.out.println("B0的构造器");
    }
}


