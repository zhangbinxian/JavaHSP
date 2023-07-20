package demo10.bx_cha.debug_;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo03_debug {
    public static void main(String[] args) {
        // debug 原码
        // F7 进入方法体
        // shift+F8 跳出方法体
        int[] arr = {1, 10, 11,3,2};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("over");
    }
}
