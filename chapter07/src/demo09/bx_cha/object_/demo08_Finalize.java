package demo09.bx_cha.object_;

public class demo08_Finalize {
    public static void main(String[] args) {
        Car bwm = new Car("bwm");
        bwm=null;   //这时，bwm对象就是一个垃圾，jvm会自动回收对象

        // 主动调用垃圾回收器
        System.gc();
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁了"+name);
    }
}