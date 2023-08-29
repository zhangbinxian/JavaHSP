package demo08.bx_cha.BigNum;

import java.math.BigInteger;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_bigInteger {
    public static void main(String[] args) {
        //当我们编程中，需要处理很大的整数，long 不够用
        //可以使用 BigInteger 的类来搞定
        // long l = 23788888899999999999999999999L;
        // System.out.println("l=" + l);

        BigInteger bigInteger = new BigInteger("2378888889999999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("10");
        System.out.println(bigInteger);

        //1. 在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行 + - * /
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);

        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);

        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);

        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);


    }
}
