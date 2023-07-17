package demo07.bx_cha.override_;

public class Override01 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.cry();
    }
}
class Animal{
    public void cry(){
        System.out.println("动物叫唤");
    }
}
class Dog extends Animal{
    // dog是animal的子类
    // dog的cry()方法和animal的cry()方法定义形式一样(名称，返回值类型，参数)
    // 这时，我们称dog的cry方法，重写(覆盖)了animal的cry方法

    public void cry(){
        System.out.println("小狗叫唤");
    }
}