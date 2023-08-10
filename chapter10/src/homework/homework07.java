package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework07 {
    public static void main(String[] args) {
        Car1 car1 = new Car1(50);
        car1.getAir().flow();

        Car1 car2 = new Car1(-10);
        car2.getAir().flow();

        Car1 car3 = new Car1(20);
        car3.getAir().flow();
    }
}

class Car1 {
    private double temperature;

    public Car1(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature >= 40) {
                System.out.println("吹冷气");
            } else if (temperature <= 0) {
                System.out.println("吹暖气");
            } else {
                System.out.println("温度正常，关闭空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}
