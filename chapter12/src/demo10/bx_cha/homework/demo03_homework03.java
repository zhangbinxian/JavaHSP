package demo10.bx_cha.homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_homework03 {
    public static void main(String[] args) {
        /**
         * 编写程序，实现以下功能
         * 输入人名: zhang bin xian,输出: xian,zhang .B
         * 输出顺序为3，1，和第2部分的首字母大写
         */
        String name = "zhang bin xian";
        String print = print(name);
        System.out.println(print);
    }

    public static String print(String str) {


        String[] split = str.split(" ");

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(split[2]).append(",")
                .append(split[0]).append(" .")
                .append(split[1].toUpperCase().charAt(0));

        return new String(stringBuffer);
    }
}
