package demo10.bx_cha.debug_;

import java.util.Arrays;

public class demo04_debug {
    public static void main(String[] args) {

        // F9 跳到下一个断点
        int[] arr = {1, 10, 11,3,2};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("100");
        System.out.println("200");
        System.out.println("300");
        System.out.println("400");
        System.out.println("500");
        System.out.println("600");
    }
}
