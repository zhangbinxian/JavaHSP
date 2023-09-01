package demo02.bx_cha.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zbx");
        list.add("bbx");
        list.add("bbx");

        // void add(int index,Object element)在index位置插入一个element
        list.add(1, "ttl");

        System.out.println("list=" + list);
        // boolean addAll(int index,Collection elements)在index位置上插入elements所有元素
        List list2 = new ArrayList();
        list2.add("list2_1");
        list2.add("list2_2");

        list.addAll(0, list2);
        System.out.println("list=" + list);

        // Object get(int index)获取index位置上的元素
        System.out.println("list.get(1)=" + list.get(1));

        // int indexOf(Object obj)返回第一次出现该元素的位置
        System.out.println("bbx第一次出现的index=" + list.indexOf("bbx"));

        // int lastIndexOf(Object obj)返回最后一次出现该元素的位置
        System.out.println("bbx最后一次出现的index=" + list.lastIndexOf("bbx"));

        // Object remove(int index)移除指定index位置上面的元素，并返回此元素
        list.remove(1);
        System.out.println("list remove(1)之后=" + list);

        // Object set(int index,Object obj)设置指定index位置上面的元素为obj，相当于替换
        list.set(0, "list2_0");
        System.out.println("list.set(0,\"list2_0\")=" + list);

        // List subList(int fromIndex,int toIndex)返回从start到end位置的子集合[fromIndex,toIndex)
        List list3 = list.subList(0, 3);
        System.out.println("list.subList(0,3)=" + list3);


    }
}
