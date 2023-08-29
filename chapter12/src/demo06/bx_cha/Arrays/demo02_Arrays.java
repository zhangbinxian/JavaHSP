package demo06.bx_cha.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, -1};

        sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("==================================");
        sort1(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (int) o1;
                int i2 = (int) o2;

                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(arr));;
    }

    // 冒泡排序
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 定制排序
    public static void sort1(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 排序由c.compare(arr[j],arr[j+1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
