package demo03.bx_cha.StringBuffer;

import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo06_StringBufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称:");
        String name = scanner.next();

        System.out.println("请输入商品价格:");
        String prize = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(prize);

        int index=stringBuffer.indexOf(".");
        stringBuffer.insert(index-3,",");

        int i;
        while ( (i=stringBuffer.indexOf(",")-3)>0){
            stringBuffer.insert(i,",");
        }
        System.out.println("商品名称"+"\t"+"商品价格");
        System.out.println(name+"\t"+stringBuffer);
    }
}
