package demo10.bx_cha.debug_;

public class demo02_debug {
    public static void main(String[] args) {
        // 数组越界

        int[] arr = {1, 10, 11};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("over");
    }
}
