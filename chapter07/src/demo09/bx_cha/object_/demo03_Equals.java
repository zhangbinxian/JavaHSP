package demo09.bx_cha.object_;

public class demo03_Equals {
    public static void main(String[] args) {

        Person person1 = new Person("zbx", 20, '男');
        Person person2 = new Person("zbx", 20, '男');

        // 重写了equals方法
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // 重写equals
    public boolean equals(Object object) {

        //判断如果比较的两个对象是同一个对象，返回true
        if (this == object) {
            return true;
        }
        if (object instanceof Person) {

            //向下转型
            Person person = (Person) object;

            if (this.name.equals(person.name) && this.age == person.age && this.gender == person.gender) {
                return true;
            }
        }
        return false;

    }
}