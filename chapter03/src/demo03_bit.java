public class demo03_bit {
    public static void main(String[] args) {

        /*
        - 最高位是符号位 0 正数,1负数
        - 正数: 原码反码补码保持一致
        - 负数: 反码 符号位不变 其他取反
        - 负数: 补码=反码+1;
        - 0: 反码,补码都是0
        - 计算机运算时,以补码方式运算
        */

        System.out.println(~3);     //~0011(补码) 1100(补码)    1011(反码)    1100(原码)    -4
        System.out.println(~-2);    //~-2   ~1010原码     ~1101反码     ~1110补码     0001取反(此时为正数)   0001原码      1
        System.out.println();
        System.out.println(2 & 3);    //0010&0011 0010    2
        System.out.println(-2 & 3);   //-2补码1110  1110&0011   0010  2
        System.out.println();
        System.out.println(2 | 3);    //0010|0011 0011    3
        System.out.println(-2 |3);   //-2补码1110  1110|0011   1111(补码)    1110(反码)    1001(原码)   -1
        System.out.println();
        System.out.println(2 ^ 3);    //0010^0011 0001    1

        //~-2解题
        //~10000000 00000000 00000000 00000010  原码
        //~11111111 11111111 11111111 11111101  反码
        //~11111111 11111111 11111111 11111110  补码
        // 00000000 00000000 00000000 00000001  取反之后    正数
        // 正数原码反码补码一致,所以00000000 00000000 00000000 00000001就是原码,结果1





    }
}
