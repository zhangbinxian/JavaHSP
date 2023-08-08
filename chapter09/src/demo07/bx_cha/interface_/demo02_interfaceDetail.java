package demo07.bx_cha.interface_;

public class demo02_interfaceDetail {
    public static void main(String[] args) {
        // 1. 接口不能实例化
        // new IA();
    }
}
interface IA{
    void say();
    // 接口当中所有方法都是public，接口中的抽象方法，可以不用abstract修饰
    public abstract void hi();
}
class Cat implements IA{

    // 一个普通类实现接口，就要将该接口的所有方法都实现

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
// 抽象类实现接口，可以不用实现接口的方法
abstract class Cat2 implements IA{

}
