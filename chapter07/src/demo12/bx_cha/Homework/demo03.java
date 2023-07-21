package demo12.bx_cha.Homework;

public class demo03 {
    public static void main(String[] args) {

        Professor professor = new Professor("teacher2", 45, "Professor", 1000);
        associateProfessor associateProfessor = new associateProfessor("teacher3", 40, "associateProfessor", 1000);
        lecturer lecturer = new lecturer("teacher4", 25, "lecturer", 1000);

        System.out.println(professor.inntroduce());
        System.out.println(associateProfessor.inntroduce());
        System.out.println(lecturer.inntroduce());
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String inntroduce() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\''+", ";
    }
}

// 教授
class Professor extends Teacher {

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public String inntroduce() {
        return super.inntroduce() + "salary=" + this.getSalary() * 1.3;
    }

}

// 副教授
class associateProfessor extends Teacher {

    public associateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public String inntroduce() {
        return super.inntroduce() + "salary=" + this.getSalary() * 1.2;
    }

}

// 讲师
class lecturer extends Teacher {

    public lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public String inntroduce() {
        return super.inntroduce() + "salary=" + this.getSalary() * 1.1;
    }
}