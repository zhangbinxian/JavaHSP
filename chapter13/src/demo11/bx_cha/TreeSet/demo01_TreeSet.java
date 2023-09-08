package demo11.bx_cha.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_TreeSet {
    public static void main(String[] args) {

        // 1. 我们使用无参构造器，创建TreeSet，任然是无须的
        // 2. 当我们希望添加的元素按照字符串大小来排序
        // 使用TreeSet提供的构造器，可以传入一个比较强(匿名内部类)

        // TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String) o1;
                String str2 = (String) o2;

                // 从小到大(a-z)
                return str1.compareTo(str2);

                // 从大到小(z-a)
                // return str2.compareTo(str1);

                // 或者这样写
                // return ((String) o1).compareTo((String) o2);
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println("TreeSet=" + treeSet);

        /**
         * 1. 构造器把传入的比较器对象，赋给了 TreeSet 的底层的 TreeMap 的属性 this.comparator
         *         public TreeMap(Comparator < ? super K > comparator) {
         *             this.comparator = comparator;
         *         }
         * 2. 在 调用 treeSet.add("tom"), 在底层会执行到
         *         if (cpr != null) {//cpr 就是我们的匿名内部类(对象)
         *
         *             do {
         *                 parent = t;
         *                 //动态绑定到我们的匿名内部类(对象)compare
         *                 cmp = cpr.compare(key, t.key);
         *                 if (cmp < 0)
         *                     t = t.left;
         *                 else if (cmp > 0)
         *                     t = t.right;
         *                 else //如果相等，即返回 0,这个 Key 就没有加入
         *                     return t.setValue(value);
         *             } while (t != null);
         *         }
         */



    }
}
