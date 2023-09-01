package demo01.bx_cha.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        // forEach
        // for循环增强，简化版的iterator，本质一样，只能用于遍历集合或数组
        // 快捷键 I
        for (Object obj : col) {
            System.out.println(obj);
        }

    }
}


