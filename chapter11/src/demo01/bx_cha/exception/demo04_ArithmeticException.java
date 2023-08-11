package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_ArithmeticException {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        // ArithmeticException 数学运算异常,当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例
        int result = n1 / n2;

        System.out.println("over");
    }

}
