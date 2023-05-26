public class demo02 {
    public static void main(String[] args) {
        P p1=new P();
        p1.Name="xiaoming";
        p1.Age=19;

        P p2=p1;
        System.out.println(p2.Name+" "+p2.Age);
    }
}
class P{
    String Name;
    int Age;
}