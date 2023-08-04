package demo03.bx_cha.codeblock;

public class demo04_CodeBlockDeatil {
    public static void main(String[] args) {
        // 构造器的最前面其实隐含了super()和调用普通代码块，
        // 静态相关的代码块，属性初始化，在类加载时，就执行完毕，
        // 因此是优先于构造器和普通代码块的执行

        BBB bbb = new BBB();
    }
}

class AAA {

    {
        System.out.println("AAA的普通代码块被调用");
    }

    public AAA() {
        //1.super()Object
        //2.调用本类的普通代码块
        System.out.println("AAA的构造器被调用");
    }
}

class BBB extends AAA {


    {
        System.out.println("BBB的普通代码块被调用");
    }

    public BBB() {
        //1.super()Object
        //2.调用本类的普通代码块
        System.out.println("BBB的构造器被调用");
    }
}