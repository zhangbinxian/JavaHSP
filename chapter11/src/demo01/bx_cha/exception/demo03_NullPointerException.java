package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_NullPointerException {
    public static void main(String[] args) {

        // NullPointerException 空指针异常,当应用程序试图在需要对象的地方使用 null 时，抛出该异常
        String name=null;
        System.out.println(name.length());
    }
}
