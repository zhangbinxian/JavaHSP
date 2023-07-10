public class demo19_this {
    public static void main(String[] args) {

        // Cat cat1 = new Cat();
        // cat1.func2();
        Cat cat2 = new Cat();

    }
}

class Cat {
    int age;
    String name;

    // 访问构造器语法：this(参数列表);注意只能在构造器当中使用(只能在构造器当中访问另一个构造器)
    public Cat() {
        //在这里访问Cat(int age, String name)
        //java: 对this的调用必须是构造器中的第一个语句
        this(20, "wxy");
        System.out.println("Cat()被调用");


    }

    public Cat(int age, String name) {
        System.out.println("Cat(int age, String name)被调用");
    }

    public void func1() {
        System.out.println("func1()方法");
    }

    public void func2() {
        System.out.println("func2()方法");
        //调用1本类的func1()
        //第一种方法
        func1();
        //第二种方法
        this.func1();

    }

}