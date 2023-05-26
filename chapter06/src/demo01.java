public class demo01 {
    public static void main(String[] args) {
        People people1 = new People();
        people1.Name = "小李";
        people1.Garden = "男";
        people1.Age = 20;
        People people2 = new People();
        people2.Name = "小明";
        people2.Garden = "男";
        people2.Age = 21;

        System.out.println(people1.Name + " " + people1.Garden + " " + people1.Age);
        System.out.println(people2.Name + " " + people2.Garden + " " + people2.Age);
    }
}

class People {
    String Name;
    String Garden;
    int Age;


}