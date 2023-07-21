package demo12.bx_cha.Homework;

public class demo01 {
    public static void main(String[] args) {


        Person []people=new Person[5];

        people[0]=new Person("1",20,"a");
        people[1]=new Person("2",46,"a");
        people[2]=new Person("3",19,"a");
        people[3]=new Person("4",18,"a");
        people[4]=new Person("5",25,"a");

        sort(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());;
        }
    }

    public static void sort(Person [] person) {
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    Person temp = person[j];
                   person[j]=person[j+1];
                   person[j+1]=temp;
                }
            }
        }
    }


}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
