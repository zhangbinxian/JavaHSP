package demo01.bx_cha.wrapper;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_wrapperVsString {
    public static void main(String[] args) {

        // 包装类-->String
        Integer i1=100;

        String str1=i1+"";
        String str2=i1.toString();
        String str3=String.valueOf(i1);


        // String-->包装类
        String num="21";
        Integer n1=Integer.parseInt(num);
        Integer i2 = new Integer(num);

    }
}
