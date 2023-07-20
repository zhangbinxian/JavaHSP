package demo10.bx_cha.debug_;

public class demo01_debug {
    public static void main(String[] args) {

        // F8逐行执行
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sun=" + sum);
        }
        System.out.println("over");
    }
}
