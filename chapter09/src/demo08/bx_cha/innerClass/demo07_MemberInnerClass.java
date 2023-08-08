package demo08.bx_cha.innerClass;

public class demo07_MemberInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.f1();

        // 外部其他类访问成员内部类的三种方法
        // 1
        Outer01.Inner01 inner01 = outer01.new Inner01();
        inner01.say();
        System.out.println();

        // 2 在外部类当中编写一个方法，返回Inner01对象实例
        Outer01.Inner01 inner01Instance = outer01.getInner01Instance();
        inner01Instance.say();
        System.out.println();

        // 3
        Outer01.Inner01 inner01Instance1 = new Outer01().getInner01Instance();
    }
}
class Outer01{
    private int n1=10;
    public String name="zzz";

    class Inner01{
        public void say(){
            System.out.println("n1="+n1);
            System.out.println("name="+name);
        }
    }

    // 返回Inner01对象实例
    public Inner01 getInner01Instance(){
        return new Inner01();
    }

    public void f1(){
        Inner01 inner01=new Inner01();
        inner01.say();
    }
}