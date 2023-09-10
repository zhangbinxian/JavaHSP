package demo01.bx_cha.generic;

import java.util.ArrayList;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Generic {
    public static void main(String[] args) {
        // 请编写程序，在 ArrayList 中，添加 3 个 Dog 对象
        // Dog 对象含有 name 和 age, 并输出 name 和 age (要求使用 getXxx())

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("dog1", 10));
        arrayList.add(new Dog("dog2", 20));
        arrayList.add(new Dog("dog3", 30));

        //假如我们的程序员，不小心，添加了一只猫
        arrayList.add(new Cat("cat1",10));

        // 遍历
        for (Object o : arrayList) {
            //向下转型 Object ->Dog
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + " " + dog.getAge());
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat { //Cat 类
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}