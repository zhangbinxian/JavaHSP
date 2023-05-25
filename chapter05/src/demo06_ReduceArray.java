import java.util.Scanner;

public class demo06_ReduceArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reduceArray(arr);
    }

    public static void reduceArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        int len = arr.length;
        System.out.println("y/n");
        char answer = sc.next().charAt(0);
        while (answer != 'n') {
            len--;  //4
            if (len > 1) {
                int[] newarr = new int[len];
                for (int i = 0; i < len; i++) {
                    newarr[i] = arr[i];
                }
                arr = newarr;
            } else {
                System.out.println("less");
            }

            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            System.out.println("y/n again?");
            answer = sc.next().charAt(0);
        }
    }
}
