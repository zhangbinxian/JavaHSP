package demo08.bx_cha.polymorphic_;

import java.lang.reflect.Array;

public class demo08_PolyArray {
    // 多态的应用1 多态数组
    public static void main(String[] args) {
        People[] people = new People[5];
        people[0] = new People("peo", 20);

        people[1] = new Student("s1", 20, 90);
        people[2] = new Student("s2", 20, 60);

        people[3] = new Teacher("t1", 30, 2000);
        people[4] = new Teacher("t2", 20, 5000);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].say());

            // instanceOf 判断运行类型是XX类或者XX类的子类
            if (people[i] instanceof Teacher) {
                Teacher teacher = (Teacher) people[i];
                teacher.teach();
                System.out.println();
            } else if (people[i] instanceof Student) {
                Student student = (Student) people[i];
                student.study();
                System.out.println();
            } else {

            }

        }
    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "name = " + name + "\tage = " + age;
    }
}

class Student extends People {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + "\tscore = " + score;
    }

    public void study() {
        System.out.println("stu" + getName() + "正在学习");
    }
}

class Teacher extends People {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String say() {
        return super.say() + "\tsalary = " + salary;
    }

    public void teach() {
        System.out.println("teach" + getName() + "正在授课");
    }
}