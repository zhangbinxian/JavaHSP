package demo08.bx_cha.polymorphic_;

public class demo02_PolyObject {
    public static void main(String[] args) {
        // 对象多态的特点

        // 编译类型是Animal，运行类型是Dog
        demo02_Animal animal=new demo02_Dog();
        animal.cry();

        animal=new demo02_Cat();
        animal.cry();
    }
}
