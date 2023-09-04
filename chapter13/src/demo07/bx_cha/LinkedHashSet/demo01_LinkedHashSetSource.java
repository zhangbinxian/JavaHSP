package demo07.bx_cha.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_LinkedHashSetSource {
    public static void main(String[] args) {

        // 分析LinkedHashSet底层机制
        Set set = new LinkedHashSet();

        set.add(new String("A"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘", 1001));
        set.add(123);
        set.add("zbx");

        // 1. LinkedHashSet 加入顺序和取出顺序一致
        System.out.println("set=" + set);
        // 2. LinkedHashSet底层维护的是一个LinkedHashMap (LinkedHashSet是HashMap的子类)
        // 3. LinkedHashSet底层结构(数组+双向链表)
        // 4. 添加第一次时，直接将 数组table扩容到 16，存放的结点类型是 LinkedHashMap$Entry
        // 5. 数组HashMap$Node[] 存放的元素/数据 是LinkedHashMap$Entry
        /**
         *   //继承关系是在内部类完成.
         *   static class Entry<K,V> extends HashMap.Node<K,V> {
         *   Entry<K,V> before, after;
         *   Entry(int hash, K key, V value, Node<K,V> next) {
         *              super(hash, key, value, next);
         *         }
         *   }
         */


    }
}

class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}