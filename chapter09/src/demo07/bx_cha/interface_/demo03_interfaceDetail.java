package demo07.bx_cha.interface_;

public class demo03_interfaceDetail {
    public static void main(String[] args) {

        // n1是静态，可以通过 接口.属性名 调用
        System.out.println(IB.n1);
        // n1是final修饰，不能改变
        // IB.n1=20;
    }
}

interface IB {


    // 接口中的属性，只能是final，而且是public static final 修饰符
    int n1=10;
    // 实际上是
    // public static final int a=1;


    void hi();
}

interface IC {
    void say();
}

// 一个类可以同时实现多个接口
class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
// 一个接口不能继承其他的类，但是可以继承多个别的接口
interface ID extends IC,IB{}