import java.util.Scanner;

public class demo01_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age = ?");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("已经成年");
        } else {
            System.out.println("未成年");
        }

    }
}
