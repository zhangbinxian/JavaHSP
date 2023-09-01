package demo02.bx_cha.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_ListExercise {
    public static void main(String[] args) {
        /**
         * 添加 10 个以上的元素(比如 String "hello" )，在 2 号位插入一个元素"zbx"，
         * 获得第 5 个元素，删除第 6 个元素，修改第 7 个元素，在使用迭代器遍历集合
         * 要求:使用 List 的实现类 ArrayList 完成。
         */
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("List" + i);
        }

        list.add(1, "zbx");
        System.out.println("List 第5个元素=" + list.get(5));

        list.remove(6);
        System.out.println(" list.remove(6)=" + list);

        list.set(7, "list7");
        System.out.println("list.set(7,\"list7\")=" + list);


        System.out.println("================iterator遍历====================");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println();
        System.out.println("=================增强for遍历=====================");
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("=================普通for循环=====================");
        for (int i = 0; i < list.size(); i++) {
            Object obj=list.get(i);
            System.out.println(obj);
        }
    }
}
