package demo08.bx_cha.BigNum;

import java.math.BigDecimal;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_bigDecimal {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，double 不够用
        //可以是 BigDecimal
        // double d=2001.11111111111999999999999977788;
        // System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("2001.11111111111999999999999977788");
        BigDecimal bigDecimal1 = new BigDecimal("1.11");

        System.out.println(bigDecimal);

        //1. 在对 BigDecimal 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        BigDecimal add = bigDecimal.add(bigDecimal1);
        System.out.println(add);

        BigDecimal subtract = bigDecimal.subtract(bigDecimal1);
        System.out.println(subtract);

        BigDecimal multiply = bigDecimal.multiply(bigDecimal1);
        System.out.println(multiply);

        // 除法可能会抛出异常，除不尽
        // BigDecimal divide = bigDecimal.divide(bigDecimal1);

        // 解决方法，可以加一个精度，在调用divide(),加精度 BigDecimal.ROUND_CEILING,如果有无限循环小数，保留到分子精度
        // 10.0001/3=3.3333...,加了参数之后会保留到小数点4位置

        BigDecimal divide = bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING);
        System.out.println(divide);




    }
}
