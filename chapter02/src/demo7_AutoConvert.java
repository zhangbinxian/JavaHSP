public class demo7_AutoConvert {
    public static void main(String[] args) {
        // 精度小的类型可以自动转换为精度大的类型
        // char-->int-->long-->float-->double
        // byte-->short-->int-->long-->float-->double

        int a='a';      //char-->int
        double d=80;    //char-->double 80-->80.0
        System.out.println(a);
        System.out.println(d);
    }
}
