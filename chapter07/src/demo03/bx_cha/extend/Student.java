package demo03.bx_cha.extend;
//父类，Pupil和Graduate的父类
public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生" + name + " 年龄" + age + " 成绩" + score);
    }
}
