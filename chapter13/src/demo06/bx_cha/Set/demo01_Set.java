package demo06.bx_cha.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Set {
    public static void main(String[] args) {

        //1. 以 Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        //2. set 接口的实现类的对象(Set 接口对象), 不能存放重复的元素, 可以添加一个 null
        //3. set 接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)
        //4. 注意：取出的顺序的顺序虽然不是添加的顺序，但是他的固定

        Set set = new HashSet();
        set.add("a");
        set.add("b");

        // 两个"c"
        set.add("c");
        set.add("c");

        // 添加了两次null
        set.add(null);
        set.add(null);

        // 取出的顺序的顺序虽然不是添加的顺序，但是他的固定
        for (int i = 0; i < 5; i++) {
            System.out.println("set" + set);
        }

        // 使用迭代器遍历
        System.out.println("=====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        // 使用增强for遍历
        System.out.println("=====增强 for====");
        for (Object obj2 : set) {
            System.out.println("obj=" + obj2);
        }


    }
}
