package demo09.bx_cha.object_;

public class demo04_EqualsExercise {
    public static void main(String[] args) {
        // f t f t f

        P p1 = new P();
        p1.name = "zz";

        P p2 = new P();
        p2.name = "zz";

        System.out.println(p1 == p2);                 //对象，==判断地址
        System.out.println(p1.name.equals(p2.name));//String 判断内容
        System.out.println(p1.equals(p2));          //对象，equals判断地址

        String s1 = new String("aaa");
        String s2 = new String("aaa");

        System.out.println(s1.equals(s2));          //String 判断内容
        System.out.println(s1 == s2);                 //对象 ==判断地址
    }
}

class P {
    public String name;
}