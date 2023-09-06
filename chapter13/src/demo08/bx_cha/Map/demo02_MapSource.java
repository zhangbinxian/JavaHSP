package demo08.bx_cha.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_MapSource {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1001", "a");//k-v
        map.put("1002", "b");//k-v

        //1. k-v 最后是 HashMap$Node node = newNode(hash, key, value, null)
        //2. k-v 为了方便程序员的遍历，还会 创建 EntrySet 集合 ，该集合存放的元素的类型 Entry, 而一个Entry
        //   对象就有k,v EntrySet<Entry<K,V>> 即： transient Set<Map.Entry<K,V>> entrySet;

        //3. entrySet 中， 定义的类型是 Map.Entry ，但是实际上存放的还是 HashMap$Node
        //   这时因为 static class Node<K,V> implements Map.Entry<K,V>

        //4. 当把 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历, 因为 Map.Entry 提供了重要方法
        //   K getKey(); V getValue();

        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet

        for (Object Obj : set) {

            System.out.println(Obj.getClass());//HashMap$Node
            //为了从 HashMap$Node 取出k-v
            //1. 先做一个向下转型
            Map.Entry entry = (Map.Entry) Obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("=============取出key 到一个set集合=============");
        Set set1 = map.keySet();
        System.out.println(set1.getClass());

        for (Object o : set1) {
            System.out.println(o);
        }
        System.out.println("=============取出value 到一个Collection集合=============");
        Collection values = map.values();
        System.out.println(values.getClass());
        for (Object o : values) {
            System.out.println(o);
        }
    }
}
