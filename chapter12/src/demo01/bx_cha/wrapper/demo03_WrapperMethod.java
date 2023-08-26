package demo01.bx_cha.wrapper;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_WrapperMethod {
    public static void main(String[] args) {
        // Integer和Character的常用方法
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 判断是不是数字
        System.out.println(Character.isDigit('a'));
        // 判断是不是字母
        System.out.println(Character.isLetter('a'));
        // 判断是不是大写
        System.out.println(Character.isUpperCase('a'));
        // 判断是不是小写
        System.out.println(Character.isLowerCase('a'));


        // 判断是不是空格
        System.out.println(Character.isWhitespace('a'));
        // 转大写
        System.out.println(Character.toUpperCase('a'));
        // 转小写
        System.out.println(Character.toLowerCase('A'));

    }
}
