package demo06.bx_cha.Arrays;


import java.util.Arrays;
import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20};
        // 二分查找,前提:数组是有序的
        // 找得到返回index
        int index = Arrays.binarySearch(arr, 10);
        System.out.println(index);

        // 找不到1返回 -(low+1)
        /**
         * int[] arr = {1, 2, 5, 10, 20};
         * 6 在原数组当中并没有
         * 如果arr当中有6，则位置应该如下
         * int[] arr = {1, 2, 5, 6, 10, 20};
         * 6在index=3的位置
         *
         * 因为没有找到6，原数组没有，则返回-(low+1),即-(3+1),-4
         */

        int index1 = Arrays.binarySearch(arr, 6);
        System.out.println(index1);

        // 数组的拷贝 copyOf
        /**
         * 1,Arrays.copyOf(oldArray, oldArray.length);
         * 拷贝整个原数组
         *
         * 2,Arrays.copyOf(oldArray, oldArray.length-1);
         * 拷贝原数组length-1的数组元素
         *
         * 3,Arrays.copyOf(oldArray, oldArray.length+1);
         * 拷贝整个原数组，在此基础上+1，最后一个为默认值，如果是对象，则为null，如果是普通类型，则是默认值0,0.0,false...
         *
         * 4,Arrays.copyOf(oldArray, -1);
         *如果长度是负数，则会抛出异常NegativeArraySizeException(负数，数组大小异常)
         */
        int[] oldArray = {1, 2, 5, 4, 10};
        int[] newArray = {};
        newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        System.out.println("copyOf()之后的数组 " + Arrays.toString(newArray));

        // 数组元素的填充
        int[] arr3 = {10, 20, 0};
        Arrays.fill(arr3, 100);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {10, 20, 30};
        int[] arr5 = {10, 20, 30};
        boolean equals = Arrays.equals(arr4, arr5);
        System.out.println("arr4与arr5元素是否一致: " + equals);

        // asList 将数组当中的元素，转为一个list集合
        int[] arr6 = {10, 20, 30};
        List list = Arrays.asList(arr6);
        System.out.println(list.getClass());

    }
}
