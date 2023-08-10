package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.shout();
        dog.shout();
    }
}

abstract class Animal {
    abstract public void shout();
}

class Cat extends Animal {


    @Override
    public void shout() {
        System.out.println("小猫叫");
    }
}

class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("小狗叫");
    }
}