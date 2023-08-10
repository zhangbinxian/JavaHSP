package demo01.bx_cha.enum_;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_EnumMethod {
    public static void main(String[] args) {
        // 使用Season2枚举类，来演示Enum的各种方法

        Season2 autumn = Season2.AUTUMN;
        // name 输出枚举对象的名称
        System.out.println(autumn.name());

        // ordinal 输出该枚举对象的次序,从0开始编号
        System.out.println(autumn.ordinal());

        // values 返回Season2[],含有定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season : values) {
            System.out.println(season);
        }

        // valueOf:将字符串转换为枚举对象,要求字符串必须是已有的常量名,否则报异常
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1 = "+ autumn1);
        System.out.println("autumn1和枚举类的autumn是同一个"+(autumn1==autumn));


        // compareTo()比较两个枚举对象的编号,左边的编号-右边的编号
        // Season2.SPRING 0,Season2.SUMMER 1
        System.out.println(Season2.SPRING.compareTo(Season2.SUMMER));
    }
}
