package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo05_ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException 数组下标越界异常,用非法索引访问数组时抛出的异常。
        // 如果索引为负或大于等于数组大小，则该索引为非法索引

        int[] arr = {1, 2, 3};
        //i<=3,越界了
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
