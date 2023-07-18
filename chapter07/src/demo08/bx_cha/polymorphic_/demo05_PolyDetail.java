package demo08.bx_cha.polymorphic_;

public class demo05_PolyDetail {
    public static void main(String[] args) {
        // 属性没有重写之说！属性的值看编译类型(= 左边)


        Base base=new Sub();
        System.out.println(base.count);

    }
}
class Base{
    int count=10;

}
class Sub extends Base{
    int count=20;

}
