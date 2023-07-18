package demo09.bx_cha.object_;

public class demo01_Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;

        System.out.println(a == c);

        B bObj=a;
        System.out.println(bObj==a);

    }

}

class A extends B{

}

class B {
}