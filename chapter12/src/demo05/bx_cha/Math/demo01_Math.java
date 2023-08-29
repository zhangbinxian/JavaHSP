package demo05.bx_cha.Math;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Math {
    public static void main(String[] args) {
        // abs绝对值
       int abs=Math.abs(9);
        System.out.println(abs);

        // - pow   求幂
        double pow=Math.pow(-3,4);
        System.out.println(pow);

        // - ceil  向上求整
        double ceil=Math.ceil(-3.00012);
        System.out.println(ceil);
        // - floor 向下求整
        double floor=Math.floor(5.90001);
        System.out.println(floor);
        // - round 四舍五入(+0.5)
        long round=Math.round(5.200001);
        System.out.println(round);
        // - sprt  开方
        double sprt=Math.sqrt(9);
        System.out.println(sprt);
        // - random    求随机数[0,1)
        // 试求一个随机数x 2<= x <7
        // (a+Math.random()*(b-a))
        // double random=(int)(2+(Math.random()*5));

        // 试求一个随机数x 2<= x <=7
        // (a+Math.random()*(b-a)+1)
        double random=(int)(2+(Math.random()*5+1));
        System.out.println(random);

        // - max   求两个数最大值
        int max=Math.max(10,1);
        System.out.println(max);

        // - min   求两个数最小值
        int min=Math.min(10,1);
        System.out.println(min);
    }
}
