import java.util.Scanner;

public class demo09_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            System.out.print("-");
            if (i == n - 1) {
                for (int j = 0; j < 2 * (i - 1) + 1; j++) {
                    System.out.print("-");
                }
            } else {
                for (int j = 0; j < 2 * (i - 1) + 1; j++) {
                    System.out.print(" ");
                }
            }
            if (i != 0) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

