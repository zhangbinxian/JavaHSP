package demo10.bx_cha.homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_homework01 {
    public static void main(String[] args) {
        // 字符串反转，abcdef-->fedcba
        // 字符串指定位置反转
        String str1 = "abcdef";

        System.out.println("反转前String: " + str1);
        String str2;
        try {
            str2 = reverse(str1, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("反转后String: " + str2);

    }

    public static String reverse(String s, int start, int end) {

        // 正确的情况，取反
        if (!(s != null && start > 0 && start < end && end <= s.length())) {
            throw new RuntimeException("参数错误");
        }

        char[] c = s.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }

        String newStr = new String(c);

        return newStr;
    }
}
