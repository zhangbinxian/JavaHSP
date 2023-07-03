public class demo17_constructor {
    public static void main(String[] args) {
        demo17_person p1 = new demo17_person("zbx", 20);

    }
}

class demo17_person {
    String name;
    int age;

    public demo17_person(String pName, int pAge) {
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }
}