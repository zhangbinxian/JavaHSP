package demo10.bx_cha.homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo05_homework05 {
    public static void main(String[] args) {
        String s1 = "zbx";
        Animals a = new Animals(s1);
        Animals b = new Animals(s1);

        System.out.println(a == b); //false
        System.out.println(a.equals(b));    //false
        System.out.println(a.name == b.name);   //true

        String s4 = new String("zbx");
        String s5 = "zbx";
        System.out.println(s1 == s4);   //false
        System.out.println(s1 == s5);   //true

        String t1 = "hello" + s1;
        String t2 = "hellozbx";
        System.out.println(t1.intern() == t2);  //true
    }
}

class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }
}