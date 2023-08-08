package demo08.bx_cha.innerClass;

public class demo04_AnonymousInnerClassDetail {
    public static void main(String[] args) {

        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Outer05 {
    private int n1 = 100;


    public void f1() {
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()");
            }
        }.hi();
    }

    public void f2() {
        Person person = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi()");
            }
        };
        person.hi();
    }
}

class Person {
    public void hi() {
        System.out.println("person hi()");
    }
}