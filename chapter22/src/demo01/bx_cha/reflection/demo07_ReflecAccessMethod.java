package demo01.bx_cha.reflection;

import java.lang.reflect.Constructor;

/**
 * @author bx_cha
 * @version 1.0
 */
@SuppressWarnings("all")
public class demo07_ReflecAccessMethod {
    public static void main(String[] args) throws Exception {
        //1. 先获取到User类的Class对象
        Class<?> userClass = Class.forName("demo01.bx_cha.reflection.Users");
        //2. 通过public的无参构造器创建实例
        // Object o = userClass.newInstance();
        Object o = userClass.getDeclaredConstructor().newInstance();
        System.out.println(o);
        //3. 通过public的有参构造器创建实例
        /*
            constructor 对象就是
            public User(String name) {//public的有参构造器
                this.name = name;
            }
         */
        //3.1 先得到对应构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object hsp = constructor.newInstance("hsp");
        System.out.println("hsp=" + hsp);

        //4. 通过非public的有参构造器创建实例
        //4.1 得到private的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        //暴破【暴力破解】 , 使用反射可以访问private构造器/方法/属性, 反射面前，都是纸老虎
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2=" + user2);
    }
}

class Users { //User类
    private int age = 10;
    private String name = "韩顺平教育";

    public Users() {//无参 public
    }

    public Users(String name) {//public的有参构造器
        this.name = name;
    }

    private Users(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

