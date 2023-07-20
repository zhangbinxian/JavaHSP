package demo10.bx_cha.debug_;

public class demo05_debug {
    public static void main(String[] args) {

        // 创建对象的流程
        // 1.加载类信息
        // 2. 初始化，2.1 默认初始化，2.2显式初始化，2.3构造器初始化
        // 3. 返回对象的地址
        People people = new People("tom",29);
        System.out.println(people.toString());
    }
}
class People{
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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
