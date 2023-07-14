import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 4, 1, 5, -10, 22};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
