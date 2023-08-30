package demo10.bx_cha.homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_homework02 {
    public static void main(String[] args) {
        // 输入用户名，密码，邮箱，如何信息录入正确，则提示注册成功，否则生成异常对象
        /**
         * 1. 用户名长度2-4
         * 2. 密码长度为6，全部为数字
         * 3. 邮箱包含"@"和"."，并且@在点前面
         */
        String username = "zbx";
        String password = "123456";
        String email = "123@zbxcom";

        try {
            luru(username, password, email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("录入成功");


    }

    public static void luru(String username, String password, String email) {
        int length = username.length();
        if (!((length >= 2 && length <= 4))) {
            throw new RuntimeException("username错误，用户名长度2-4");
        }

        if (!(password.length() == 6 && isDigital(password))) {
            throw new RuntimeException("password错误，密码长度为6，全部为数字");
        }

        // if (!(trueEmail(email))) {
        //     throw new RuntimeException("email错误，邮箱包含@和\".\"，并且@在点前面");
        // }
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        if (!(index1 > 0 && index2 > index1)) {
            throw new RuntimeException("email错误，邮箱包含@和\".\"，并且@在点前面");
        }
    }

    // 判断str是否为数字
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 取错误情况，判断不在0-9之间，返回false
            if (chars[i] < '0' && chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean trueEmail(String str) {
        char[] chars = str.toCharArray();
        // 123@zbx.com
        // index1 记录@位置,index2记录"."位置
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '@') {
                index1 = i;
            }
            if (chars[i] == '.') {
                index2 = i;
            }
            if (index1 != -1 && index2 != -1 && index1 < index2) {
                return true;
            }
        }
        return false;
    }
}
