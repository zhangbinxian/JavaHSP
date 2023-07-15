package demo02.bx_cha.encap;

public class demo01_Encap {
    public static void main(String[] args) {
        People people = new People();
        people.setName("bx_cha");
        people.setAge(19);
        people.setSalary(8000);

        System.out.println(people.toString());

        System.out.println();

        People people1 = new People("zbxxxx", 18, 2000);
        System.out.println(people1.toString());
    }
}

class People {
    public String name;
    private int age;
    private double salary;  //工资

    public People() {
    }

    public People(String name, int age, double salary) {
        // this.name = name;
        // this.age = age;
        // this.salary = salary;

        //使用构造器时，为了set方法参数验证依然有效，注释掉默认this.属性=属性
        //使用set方法 setName(name),或者this.setName(name)

        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() > 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name长度有误，已更改为默认name=user");
            this.name = "user";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 20 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("age 范围有误，已更改为默认age=22");
            this.age = 22;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}