package demo01.bx_cha.static_;

public class demo03_StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student("s1");
        s1.payFee(2000);

        Student s2 = new Student("s2");
        s2.payFee(1000);

        Student.showFee();
    }
}
class Student{
    private String name;

    // 学费
    private static double fee=0;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void payFee(double fee){
        Student.fee+=fee;
    }

    // static修饰的方法 静态方法
    // 静态方法就可以访问到静态属性，静态变量
    public static void setFee(double fee) {
        // 将传进来的fee累加到 static的fee
        Student.fee = fee;
    }
    public static void showFee(){
        System.out.println("一共收集了"+Student.fee+"学费");
    }
}
