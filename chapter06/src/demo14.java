public class demo14 {
    public static void main(String[] args) {


        demo14_Method m = new demo14_Method();

        String user0 = m.func1("zbx", 33.5, 60, 80, 90);
        String user1 = m.func1("wxy", 100, 99, 100);

        System.out.println(user0);
        System.out.println(user1);
    }
}

class demo14_Method {
    public String func1(String name, double... scores) {
        int sumscore = 0;
        for (int i = 0; i < scores.length; i++) {
            sumscore += scores[i];
        }
        return name + " " + scores.length + "门课程总分" + sumscore;
    }
}
