public class demo10_ForceConvert {
    public static void main(String[] args) {

        //强制类型转换

        //丢失精度
        int n1 = (int) 1.9;
        System.out.println("n1 = " + n1);

        //溢出
        byte b = (byte) 2000;
        System.out.println("b = " + b);


    }
}
