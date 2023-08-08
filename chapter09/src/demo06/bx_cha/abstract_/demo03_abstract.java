package demo06.bx_cha.abstract_;

public class demo03_abstract {
    public static void main(String[] args) {

    }
}

// 抽象类可以有任意成员(抽象类还是类)，可以有构造器，属性，方法等
abstract class C {
    public int n1;
    public String name;

    public C(int n1, String name) {
        this.n1 = n1;
        this.name = name;
    }

    public abstract void hi();

    public void hello() {

    }
}

// 如果一个类继承了抽象类，则它必须实现抽象类的所以抽象方法，除非它自己也声明为abstract类
abstract class D {
    public abstract void hi();
}

class E extends D {
    @Override
    public void hi() {
        System.out.println("实现了抽象父类的hi方法");
    }
}

abstract class F extends D {

}