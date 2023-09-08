package demo12.bx_cha.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_TreeMap {
    public static void main(String[] args) {
        //使用默认的构造器，创建 TreeMap, 是无序的(也没有排序)

        // 要求按照传入的 k(String) 的大小进行排序

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                String str1 = (String) o1;
                String str2 = (String) o2;

                // 按照传入的 k(String) 的大小进行排序
                // 从小到大(a-z)
                // return str1.compareTo(str2);


                //按照 K(String) 的长度大小排序
                // 长度从小到大
                return str1.length()-str2.length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");
        treeMap.put("hsp", "韩顺平");//加入不了
        System.out.println("treemap=" + treeMap);
    }
}
