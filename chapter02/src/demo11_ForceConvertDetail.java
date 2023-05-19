public class demo11_ForceConvertDetail {
    public static void main(String[] args) {
        // int y1 = (int) 10 * 3.5 + 6 * 1.5;      //错误后面运算结果为double 不可赋值给int
        int y2 = (int) (10 * 3.5 + 6 * 1.5);

        System.out.println(y2);

        // - char可以保存int的常量值,但不能保存int的变量值,需要强转
        char c1=100;
        int m=100;
        // char c2=m;  //错误 int 不能赋值给 char
        char c3=(char)m;    //可以
        System.out.println(c3);
    }
}
