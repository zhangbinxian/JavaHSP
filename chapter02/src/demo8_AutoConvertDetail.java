import java.lang.reflect.Type;

public class demo8_AutoConvertDetail {
    public static void main(String[] args) {

        // char-->int-->long-->float-->double
        // byte-->short-->int-->long-->float-->double

        //有多种数据类型混合运算时,系统将自动将所有数据转换为容量最大的数据类型,再计算
        //当将精度大的数据赋值给精度小的数据类型时,会报错,反之会自动转换
        //(byte,short)和char之间不会相互自动转换
        //byte,short,char 三者之间可以计算,在计算时首先转换为int类型
        //boolean不参与转换
        //自动提升原则:表达式的结果自动提升为操作数当中最大的类型

        int n1=10;
        float d1=n1+1.1F;
        double d2=n1+1.1;

        byte b1=10;     //-128--127

        //byte,short,char 三者之间可以计算,在计算时首先转换为int类型
        byte bi=1;
        short si=2;
        char ci=3;
        System.out.println(bi+si+ci);


    }
}
