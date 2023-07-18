package demo09.bx_cha.object_;

public class demo05_EqualsExercise {
    public static void main(String[] args) {

        //t t t f t f

        //A ascii 65
        int it=65;
        float f1=65.0f;
        System.out.println(it==f1);         //类型自动转换

        char ch1='A';
        char ch2=12;
        System.out.println(it==ch1);
        System.out.println(12==ch2);

        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1==s2);             //判断地址
        System.out.println(s1.equals(s2));      //判断内容
        // System.out.println("hello"==new java.sql.Date());        //编译报错

    }
}
