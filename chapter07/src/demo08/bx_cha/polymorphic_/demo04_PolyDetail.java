package demo08.bx_cha.polymorphic_;

public class demo04_PolyDetail {
    public static void main(String[] args) {

        Animals animals = new Cats();

        // 向下转型
        Cats cats = (Cats) animals;
        cats.catchMouse();


    }
}

class Animals {
    String name = "动物";
    int age = 10;

    public void sleep() {
        System.out.println("sleep");
    }

    public void run() {
        System.out.println("run");
    }

    public void eat() {
        System.out.println("eat");
    }

    public void show() {
        System.out.println("nihao");
    }
}

class Cats extends Animals {
    public void eat() {
        System.out.println("cat eat fish");
    }

    public void catchMouse() {
        System.out.println("catch mouse");
    }
}