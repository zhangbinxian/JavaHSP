package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo08_try_catch_finally {
    public static void main(String[] args) {
        try {
            String str = "zbx";
            int num = Integer.parseInt(str);
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("异常信息: " + e.getMessage());

        } finally {
            System.out.println("无论代码是否异常，都执行finally");
        }

    }
}
