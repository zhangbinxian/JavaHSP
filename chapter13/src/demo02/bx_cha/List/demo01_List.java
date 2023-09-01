package demo02.bx_cha.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_List {
    public static void main(String[] args) {

        //1. List 集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list=new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // List集合类元素可重复
        list.add("d");

        //2. List 集合中的每个元素都有其对应的顺序索引，即支持索引
        // 索引是从 0 开始的
        System.out.println(list.get(3));



        System.out.println("list="+list);

    }
}
