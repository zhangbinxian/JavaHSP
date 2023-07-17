package demo08.bx_cha.polymorphic_;

public class demo03_PolyDetail {
    public static void main(String[] args) {
        // 向上转型：父类的引用类型指向了子类的对象
        // 父类类型 引用名 = new 子类类型();
        Animal animal = new Cat();
        Object object = new Cat();


        // 可以调用父类的所有成员(需要遵循访问权限)
        System.out.println("可以调用父类的所有成员(需要遵循访问权限)");
        System.out.println(animal.age);
        System.out.println(animal.name);
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        // 不能调用子类中特有成员
        // 因为在编译阶段，能调用哪些成员，由编译器来决定
        // animal.catchMouse();

        // 最终运行结果看子类的具体实现，从子类开始查找方法，与之前的查找调用规则一致
        System.out.println("最终运行结果看子类的具体实现");
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

    }
}

class Animal {
    String name = "动物";
    int age = 10;

    public void sleep() {
        System.out.println("sleep");
    }

    public void run() {
        System.out.println("run");
    }

    public void eat() {
        System.out.println("eat");
    }

    public void show() {
        System.out.println("nihao");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("cat eat fish");
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}