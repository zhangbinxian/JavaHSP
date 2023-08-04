package demo03.bx_cha.codeblock;

public class demo02_CodeBlockDeatil {
    public static void main(String[] args) {

        // 静态代码块，作用就是对类进行初始化，它会随着类的加载而执行，并且只执行一次

        // 1，创建对象实例时(new)。
        AA aa = new AA();

        // 2，创建子类对象实例，父类也会被加载。
        BB bb = new BB();

        // 3，使用类的静态成员时(属性，方法)
        System.out.println(Cat.age);


    }
}

class AA {
    static {
        System.out.println("AA的静态代码块被执行");
    }
}

class BB extends AA {
    static {
        System.out.println("BB的静态代码块被执行");
    }
}

class Cat {
    public static int age = 10;

    static {
        System.out.println("Cat的静态代码块被执行");
    }
}