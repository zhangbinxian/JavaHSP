package demo09.bx_cha.object_;

public class demo06_hashCode_ {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();

        AA aa3 = aa1;
        System.out.println("aa1.hashCode()= " + aa1.hashCode());
        System.out.println("aa2.hashCode()= " + aa2.hashCode());

        System.out.println("aa3.hashCode()= " + aa3.hashCode());
    }
}

class AA {

}