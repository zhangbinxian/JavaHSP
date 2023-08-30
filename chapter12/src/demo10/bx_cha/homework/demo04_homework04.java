package demo10.bx_cha.homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_homework04 {
    public static void main(String[] args) {

        /**
         * char ascii对应表
         * 'A' 'Z' 'a' 'z' '0' '9'
         *  65  90  97  122 48  57
         */
        String str = "ABCabcd12345";

        char[] chars = str.toCharArray();
        int Upper = 0;
        int Lower = 0;
        int Num = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                Upper += 1;
            }
            if (chars[i] >= 97 && chars[i] <= 122) {
                Lower += 1;
            }
            if (chars[i] >= 48 && chars[i] <= 57) {
                Num += 1;
            }
        }
        System.out.println("Upper=" + Upper);
        System.out.println("Lower=" + Lower);
        System.out.println("Num=" + Num);
    }
}