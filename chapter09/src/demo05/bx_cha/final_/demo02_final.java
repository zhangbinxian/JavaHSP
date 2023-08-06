package demo05.bx_cha.final_;

public class demo02_final {
    public static void main(String[] args) {


    }
}
// 我们不希望C的hi方法子类被重写,使用final修饰
class C {
   final public void hi() {

    }
}

class D extends C {
    // @Override
    // public void hi() {
    //     System.out.println("重写了C类的hi()方法");
    // }
}