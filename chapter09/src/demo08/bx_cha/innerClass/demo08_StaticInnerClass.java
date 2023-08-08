package demo08.bx_cha.innerClass;

public class demo08_StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.f1();

        // - 外部其他类.访问--->成员内部类
        // 1
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.hi();

        // 2 在外部类当中编写一个方法，返回Inner01对象实例
        Outer10.Inner10 inner10Instance = outer10.getInner10Instance();
        inner10Instance.hi();

        // 3 在外部类当中编写一个静态方法，返回Inner01对象实例
        Outer10.Inner10 inner10Instance_ = Outer10.getInner10Instance_();
        inner10Instance_.hi();


    }
}
class Outer10{
    private int n1=10;
    private static String name="zz";

    static class Inner10{
        public void hi(){
            // 不能访问非static成员
            // System.out.println(n1);

            System.out.println(name);
        }
    }

    public Inner10 getInner10Instance(){
        return new Inner10();
    }
    public  static Inner10 getInner10Instance_(){
        return new Inner10();
    }

    public void f1(){
        Inner10 inner10 = new Inner10();
        inner10.hi();
    }
}