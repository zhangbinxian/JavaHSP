package demo09.bx_cha.object_;

public class demo07_toString_ {
    public static void main(String[] args) {

        Moster moster = new Moster("moster", "run", 1000);

        // 默认返回：全类名(包名+类名)+@+哈希值的16进制
        // 重写toString方法，打印对象或者拼接对象时，都会自动调用该对象的toString

        System.out.println(moster.toString());

        // 当直接输出一个对象时，toString会被默认调用
        System.out.println(moster);
        // 等价于 System.out.println(moster.toString());
    }
}
class Moster{
    private String name;
    private String job;
    private double salary;

    public Moster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Moster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
