import java.util.Scanner;

public class demo05_AddArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int len = arr1.length;  //3

        Scanner sc = new Scanner(System.in);
        System.out.println("y/n");

        char answer = sc.next().charAt(0);


        while (answer != 'n') {

            System.out.println("add num");
            int newNum = sc.nextInt();
            len++;  //4

            int[] newarr = new int[len];
            for (int i = 0; i < len - 1; i++) {
                newarr[i] = arr1[i];
            }


            newarr[len - 1] = newNum;

            arr1 = newarr;
            System.out.println("again y/n");
            answer = sc.next().charAt(0);
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
