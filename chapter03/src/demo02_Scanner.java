import java.util.Scanner;

public class demo02_Scanner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("请输入name,age,和score: ");
        String name = sc.next();
        int age = sc.nextInt();
        double score = sc.nextDouble();

        System.out.println("name=" + name + " age=" + age + " score=" + score);
    }
}

