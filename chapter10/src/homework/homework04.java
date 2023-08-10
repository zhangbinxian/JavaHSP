package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        cellphone.testwork(new Icalc() {
            @Override
            public double work(double Num1, double Num2) {
                return Num1+Num2;
            }
        }, 10, 20);

        cellphone.testwork(new Icalc() {
            @Override
            public double work(double Num1, double Num2) {
                return Num1*Num2;
            }
        },5,3);
    }
}

interface Icalc {
    public double work(double Num1, double Num2);
}

class Cellphone {
    public void testwork(Icalc icalc, double Num1, double Num2) {
        double result = icalc.work(Num1, Num2);
        System.out.println("结果为" + result);
    }
}
