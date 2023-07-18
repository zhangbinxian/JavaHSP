package demo09.bx_cha.object_;

public class demo02_Equals {
    public static void main(String[] args) {


        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1.equals(integer2));
        System.out.println(integer1 == integer2);
    }
}
