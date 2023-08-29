package demo06.bx_cha.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 10};
        // 遍历数组，除了for循环，还可以使用toString()
        System.out.println(Arrays.toString(arr));

        // sort
        int[] arr1 = {1, 20, 3, 10, 6};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        // 调用 定制排序 时，传入两个参数
        // (1) 排序的数组 arr
        // (2) 实现了 Comparator 接口的匿名内部类 , 要求实现 compare 方法

        Integer[] arr2 = {1, 20, 3, 10, 6, 7, 21};
        Arrays.sort(arr2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr2));

    }
}
