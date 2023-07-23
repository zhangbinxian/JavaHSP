package demo12.bx_cha.Homework;

import java.util.Objects;

public class demo13 {

    public static void main(String[] args) {
        Persen[] persens = new Persen[4];
        persens[0] = new Student("stu1", "男", 20, "0001");
        persens[1] = new Student("stu2", "男", 19, "0002");
        persens[2] = new Teach("teach1", "男", 30, 4);
        persens[3] = new Teach("teach2", "男", 45, 10);

        sort(persens);

        for (int i = 0; i < persens.length; i++) {
            System.out.println(persens[i]);
        }


        System.out.println("=====================");
        func(persens[0]);
        func(persens[2]);

        System.out.println("=====================");
        func2(persens[0]);
        func2(persens[2]);


    }

    public static void sort(Persen[] persens) {
        for (int i = 0; i < persens.length - i; i++) {
            for (int j = 0; j < persens.length - 1 - i; j++) {
                if (persens[j].getAge() > persens[j + 1].getAge()) {
                    Persen tempPersen = persens[j];
                    persens[j] = persens[j + 1];
                    persens[j + 1] = tempPersen;
                }
            }
        }
    }

    public static void func(Persen p) {
        if (!(p instanceof Persen)) {
            System.out.println("参数有误");
            return;
        }
        if (p instanceof Student) {
            Student stu = (Student) p;
            stu.study();
        }
        if (p instanceof Teach) {
            Teach teach = (Teach) p;
            teach.teach();
        }
    }

    public static void func2(Persen p) {
        if (!(p instanceof Persen)) {
            System.out.println("参数有误");
            return;
        }
        if (p instanceof Student) {
            Student stu = (Student) p;
            System.out.println(stu.play());
        }
        if (p instanceof Teach) {
            Teach teach = (Teach) p;
            System.out.println(teach.play());
        }
    }
}

class Persen {
    private String name;
    private String sex;
    private int age;

    public Persen(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persen{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public String play() {
        return null;
    }
}

class Student extends Persen {

    private String id;

    public Student(String name, String sex, int age, String id) {
        super(name, sex, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "id='" + id + '\'' +
                '}';
    }

    public void study() {
        System.out.println("好好学习");
    }

    public String play() {
        return this.getName() + "喜欢玩足球";
    }
}

class Teach extends Persen {
    private int work_age;

    public Teach(String name, String sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return super.toString() + "Teach{" +
                "work_age=" + work_age +
                '}';
    }

    public void teach() {
        System.out.println("好好教学");
    }

    public String play() {
        return this.getName() + "喜欢玩象棋";
    }
}
