package demo14.bx_cha.homework;

import java.util.*;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_homework {
    public static void main(String[] args) {
        /**
         * 按要求完成下列任务
         * 1）使用HashMap类实例化一个Map类型的对象m，键（String）和值（int）分别用于存储员工的姓名和工资，
         * 存入数据如下：	jack—650元；tom—1200元；smith——2900元；
         * 2）将jack的工资更改为2600元
         * 3）为所有员工工资加薪100元；
         * 4）遍历集合中所有的员工
         * 5）遍历集合中所有的工资
         */

        Map map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);

        System.out.println(map);

        // 将jack的工资更改为2600元
        map.put("jack", 2600);
        System.out.println(map);

        // 为所有员工工资加薪100元；
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            map.put(key, (Integer) map.get(key) + 100);
        }
        System.out.println(map);

        System.out.println("=============遍历=============");
        //遍历 EntrySet
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("====遍历所有的工资====");
        Collection values = map.values();
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println("工资=" + next);
        }

    }
}
