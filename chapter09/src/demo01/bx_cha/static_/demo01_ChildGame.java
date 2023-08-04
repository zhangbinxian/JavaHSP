package demo01.bx_cha.static_;

public class demo01_ChildGame {
    public static void main(String[] args) {

        // count 添加加入游戏
        // int count = 0;

        Child child1 = new Child("child1");
        child1.join();
        // count++;
        child1.count++;

        Child child2 = new Child("child2");
        child2.join();
        // count++;
        child2.count++;

        Child child3 = new Child("child3");
        child3.join();
        // count++;
        child3.count++;

        System.out.println(Child.count + "个child加入了游戏");
    }
}

class Child {
    private String name;

    // 定义一个count，静态变量
    // 该变量最大的特点是可以被该类的所有对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏");
    }
}