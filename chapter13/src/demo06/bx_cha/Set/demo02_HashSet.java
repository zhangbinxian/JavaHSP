package demo06.bx_cha.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_HashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //1. 在执行 add 方法后，会返回一个 boolean 值
        //2. 如果添加成功，返回 true, 否则返回 false
        //3. 可以通过 remove 指定删除哪个对象
        System.out.println(set.add("a"));
        System.out.println(set.add("b"));
        System.out.println(set.add("a"));
        System.out.println(set.add("c"));
        System.out.println(set.add("d"));

        set.remove("a");

        System.out.println("set=" + set);


        set = new HashSet();
        System.out.println("set=" + set);//0
        //4 Hashset 不能添加相同的元素/数据?
        set.add("lucy");//添加成功
        set.add("lucy");//加入不了
        set.add(new Dog("tom"));//OK
        set.add(new Dog("tom"));//Ok
        System.out.println("set=" + set);


        //在加深一下. 非常经典的面试题.

        //看源码，做分析， 先给小伙伴留一个坑，以后讲完源码，你就了然
        //去看他的源码，即 add 到底发生了什么?=> 底层机制.
        set.add(new String("hsp"));//ok
        set.add(new String("hsp"));//加入不了.
        System.out.println("set=" + set);

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}