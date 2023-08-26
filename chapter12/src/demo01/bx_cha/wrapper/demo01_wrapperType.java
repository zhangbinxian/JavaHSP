package demo01.bx_cha.wrapper;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_wrapperType {
    public static void main(String[] args) {
        // Boolean,Character
        // Byte,Short,Integer,Long,Float,Double


        // jdk5.0之前，手动装箱和拆箱
        int n1=10;
        Integer integer1=new Integer(n1);
        Integer integer2=Integer.valueOf(n1);

        Integer n2=new Integer(100);
        int n3=n2.intValue();


        // jdk5.0之后，自动装箱和拆箱，自动装箱调用valueOf()方法,
        // 自动拆箱调用intValue()

        int m=200;
        Integer integerM=m;

        Integer integerM2=new Integer(100);
        int m2=integerM2;

    }
}
