public class demo18_this {
    public static void main(String[] args) {

        Dog d1 = new Dog("d1", 3);
        d1.info();
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void info() {
        System.out.println(name + " " + age + " info");
    }
}