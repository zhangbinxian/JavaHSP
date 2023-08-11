package demo01.bx_cha.exception;

import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo11_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        while (true){
            System.out.println("请输入一个整数");
            inputStr=sc.next();

            try {
                num=Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误");
            }
        }
        System.out.println("输入为:"+num);
    }
}
