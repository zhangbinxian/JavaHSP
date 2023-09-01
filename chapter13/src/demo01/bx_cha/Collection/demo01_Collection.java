package demo01.bx_cha.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Collection {
    public static void main(String[] args) {
        //1. 集合主要是两组(单列集合 , 双列集合)
        //2. Collection 接口有两个重要的子接口 List Set , 他们的实现子类都是单列集合
        //3. Map 接口的实现子类 是双列集合，存放的 K-V
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123+123);
        System.out.println(list);


        HashMap hashMap = new HashMap();
        hashMap.put("NO1", "北京");
        hashMap.put("NO2", "上海");

        System.out.println(hashMap);
    }
}
