public class demo02 {
    public static void main(String[] args) {
        People_demo02 p1 = new People_demo02();
        p1.Name = "xiaoming";
        p1.Age = 19;

        People_demo02 p2 = p1;
        System.out.println("p1 " + p1.Name + " " + p1.Age);
        System.out.println("p2 " + p2.Name + " " + p2.Age);

        p2.Age = 2220;
        System.out.println("p1 " + p1.Name + " " + p1.Age);
        System.out.println("p2 " + p2.Name + " " + p2.Age);
    }
}

class People_demo02 {
    String Name;
    int Age;
}