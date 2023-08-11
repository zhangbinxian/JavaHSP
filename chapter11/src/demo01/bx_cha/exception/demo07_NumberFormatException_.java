package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo07_NumberFormatException_ {
    public static void main(String[] args) {

        /**
         * NumberFormatException 数字格式不正确异常,当应用程序试图将字符串转换成一种数值类型，
         * 但该字符串不能转换为适当格式时，抛出该异常 => 使用异常,我们可以确保输入是满足条件数字
         */
        String name1="100";
        String name2="zbx";
        //将string转为int 100-->100
        int num1=Integer.parseInt(name1);
        System.out.println(num1);
        // 将string转为int zbx-->?
        int num2=Integer.parseInt(name2);
        System.out.println(num2);
    }
}
