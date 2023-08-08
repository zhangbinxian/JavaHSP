package demo07.bx_cha.interface_;

public class demo01_interface {
    public static void main(String[] args) {

    }
}

interface AInterface {

    public void hi();

    // 在jdk7之前，接口里的所有方法都没有方法体，即都是抽象方法<br>
    // 在jdk8之后，可以有静态方法，默认方法，即在接口当中可以有方法的具体实现，需要家default关键字修饰
    default public void hello(){
        System.out.println("hello");
    }
    public static void hello2(){
        System.out.println("hello2");
    }
}

class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("A类实现了Ainterface的hi方法");
    }
}