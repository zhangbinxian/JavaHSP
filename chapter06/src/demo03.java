public class demo03 {
    public static void main(String[] args) {
        People_demo03 p1 = new People_demo03();
        p1.name = "a";
        p1.age = 10;
        p1.speak();
        p1.calc();
        p1.calcN(100);
        p1.getSum(12, 100);

    }
}

class People_demo03 {
    String name;
    int age;

    public void speak() {
        System.out.println("i am " + this.name);
    }

    public void calc() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("0+...+100=" + sum);
    }

    public void calcN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("0+...+" + n + "=" + sum);
    }

    public void getSum(int num1, int num2) {
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }
}