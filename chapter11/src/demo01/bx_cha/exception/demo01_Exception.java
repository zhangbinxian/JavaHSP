package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Exception {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        // int result = n1 / n2;
        // num/0,除数不能为0，程序会抛出异常ArithmeticException
        // 当抛出异常之后，下面的代码将不会执行

        /**
         * 选中代码片段
         * ctrl+alt+t 选择try-catch
         */
        try {
            int result = n1 / n2;
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("异常原因: "+e.getMessage());
        }

        System.out.println("over");
    }
}
