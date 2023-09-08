package demo10.bx_cha.Properties;

import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Properties {
    public static void main(String[] args) {
        //1. Properties 继承 Hashtable
        //2. 可以通过 k-v 存放数据，当然 key 和 value 不能为 null

        Properties properties = new Properties();
        //properties.put(null, "abc");//抛出 空指针异常
        //properties.put("abc", null); //抛出 空指针异常
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//如果有相同的 key ， value 被替换
        System.out.println("properties=" + properties);

        //通过 k 获取对应值
        System.out.println(properties.get("lic"));//88

        //删除
        properties.remove("lic");
        System.out.println("properties=" + properties);

        //修改
        properties.put("john", "约翰");
        System.out.println("properties=" + properties);
    }
}
