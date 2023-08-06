package demo04.bx_cha.single_;

public class demo02_single {
    public static void main(String[] args) {
        // 懒汉式单例设计模式

        // 懒汉式只有用户使用 getInstance()时,才会返回对象,后面再次使用时,会返回上传创建的对象
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance.toString());

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1.toString());


        System.out.println(instance==instance1);


    }
}

class Cat {
    public static int n1 = 100;
    private String name;

    // 2. 类的内部创建对象
    private static Cat cat;

    // 1. 构造器私有化，防止在类的外面new对象
    private Cat(String name) {
        System.out.println("构造器Cat(String name)被调用");
        this.name = name;
    }

    // 3. 向外暴露一个静态的公共方法，getInstance，get实例
    public static Cat getInstance() {
        // 还没有创建Cat对象
        if (cat == null) {

            cat = new Cat("小猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}