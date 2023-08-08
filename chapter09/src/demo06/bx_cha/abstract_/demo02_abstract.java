package demo06.bx_cha.abstract_;

public class demo02_abstract {
    public static void main(String[] args) {
        // 1. 抽象类不能被实例化
        // new A();
    }
}

//2. 抽象类不一定含有abstract方法，抽象类可以没有abstract方法
abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}


// 3. 一旦含有abstract方法，则这个类必须是abstract类
abstract class B {
    public abstract void hi();
}

// 4. abstract只能修复类和方法，不能修饰其他
