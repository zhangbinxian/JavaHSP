package demo09.bx_cha.HashTable;

import java.util.Hashtable;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_HashTable {
    public static void main(String[] args) {

        /**
         * HashTable基本介绍
         * 1. 存放的元素是键值对 K—V
         * 2. hashtable存放的元素的键和值都不能为null，否则会抛出NullPointerException
         * 3. hashtable使用方法基本和HashMap一样
         * 4. hashTable的线程安全的，hashMap是线程不安全
         */

        Hashtable hashtable = new Hashtable();
        hashtable.put("a", 100);    //ok
        // hashtable.put(null, 200);   //异常
        // hashtable.put("b", null);   //异常
        hashtable.put("c", 300);    //ok
        hashtable.put("d", 400);    //ok
        hashtable.put("d", 350);    //替换

        System.out.println(hashtable);

        //1. 底层有数组Hashtable$Entry[] 初始化大小 11
        //2. 临界值 threshold 8 =11*0.75
        //3. 扩容：按照自己的扩容机制来进行扩容 newCapacity=(oldCapacity<<1)+1; 扩大2倍+1
        //4. 执行 方法addEntry(hash,key,value,index);添加K-V,封装到Map.Entry

    }
}
