package demo05.bx_cha.final_;

public class demo05_finalDetail {
    public static void main(String[] args) {

        // final类不能被继承,但是可以实例化对象
        CC cc = new CC();

        EE ee = new EE();
        ee.hi();
    }

}

// final修饰的属性在定义时,必须赋值,并且以后都不能修改
class AA {
    // 1 定义时,public final double PI=3.14
    public final double RATA = 0.1;

    public final double RATA2;

    public final double RATA3;

    // 2 在构造器中
    public AA() {
        RATA2 = 0.2;
    }

    // 3 在代码块中
    {
        RATA3 = 0.3;
    }
}

// 如果final修饰的属性是静态的,则初始化位置只能是
class BB {
    // - 定义时
    public static final double PI1 = 3.14;

    public static final double PI2;

    static {
        // - 在静态代码块当中,不能在构造器中
        PI2 = 3.141;
    }

}

// final类不能被继承,但是可以实例化对象
final class CC {

}

// 如果类不是final类,但是含有final方法,则该方法虽然不能重写,但是可以被继承
class DD{
    public final void hi(){
        System.out.println("hi");
    }
}
class EE extends DD{

}