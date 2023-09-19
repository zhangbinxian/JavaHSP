package demo09.bx_cha.Properties;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 使用 Properties 类来创建 配置文件, 修改配置文件内容
 */
public class demo03_properties03 {
    public static void main(String[] args) throws IOException {

    }

    @Test
    public void updateProperties() throws IOException {

        String path = "./src/demo09/bx_cha/Properties/resource/mysql2.properties";

        // 创建对象
        Properties properties = new Properties();
        // 创建
        //1.如果该文件没有 key 就是创建
        //2.如果该文件有 key ,就是修改

        // 修改
        /*
        Properties 父类是 Hashtable ， 底层就是 Hashtable 核心方法

         public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
            throw new NullPointerException();
        }

        // Makes sure the key is not already in the hashtable.
        Entry<?,?> tab[] = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;
        @SuppressWarnings("unchecked")
        Entry<K,V> entry = (Entry<K,V>)tab[index];
        for(; entry != null ; entry = entry.next) {
            if ((entry.hash == hash) && entry.key.equals(key)) {
                V old = entry.value;
                entry.value = value;
                return old;
            }
        }

        addEntry(hash, key, value, index);
        return null;
    }
         */

        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "我自己");
        properties.setProperty("passwd", "123456");

        // 将k-v存储到文件
        // properties.store(new FileOutputStream(path),null);//null 表示不需要注释
        properties.store(new FileOutputStream(path), "user and passwd");
        System.out.println("save Over");


    }
}
