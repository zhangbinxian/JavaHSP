public class demo4_bit2 {
    public static void main(String[] args) {
        // >> 右移:符号位不变,低位溢出,符号位补溢出的高位
        // << 左移:符号位不变,低位补0
        // >>> 逻辑右移,也叫无符号右移:低位溢出,高位补0
        // <<< 没有这个
        System.out.println(1>>2);   //0001(>>2位)    0000
        System.out.println(7>>2);   //0111(>>2位)    0111>>2 0001
        System.out.println();
        System.out.println(1<<2);   //0001(<<2位)    0100
        System.out.println(3<<2);   //0000 0011(<<2位)   0000 1100   12
        System.out.println();
        System.out.println(-2>>>2);
        //10000000 00000000 00000000 00000010y
        //11111111 11111111 11111111 11111101f
        //11111111 11111111 11111111 11111110b

        //00111111 11111111 11111111 11111111
        //1073741823

    }
}
