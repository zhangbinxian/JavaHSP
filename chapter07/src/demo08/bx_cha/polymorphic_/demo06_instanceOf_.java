package demo08.bx_cha.polymorphic_;

public class demo06_instanceOf_ {
    public static void main(String[] args) {
        // instanceOf比较操作符，用于判断对象的运行类型是否为XX类型或者XX类型的子类型

        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);

        AA aa=new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

    }
}
class AA{

}
class BB extends AA{

}
