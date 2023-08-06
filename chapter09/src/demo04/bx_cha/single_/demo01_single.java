package demo04.bx_cha.single_;

public class demo01_single {
    public static void main(String[] args) {
        // 饿汉式单例设计模式

        System.out.println(GirlFriend.n1);

        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance.toString());

        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1.toString());

        System.out.println(instance==instance1);
    }
}

class GirlFriend {

    public static int n1=100;

    private String name;

    // 1. 构造器私有化private
    private GirlFriend(String name) {
        System.out.println("构造器GirlFriend(String name)被调用");
        this.name = name;
    }

    // 2. 类的内部创建对象
    private static GirlFriend girlFriend = new GirlFriend("女朋友");

    // 3. 向外暴露一个静态的公共方法，getInstance，get实例
    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}