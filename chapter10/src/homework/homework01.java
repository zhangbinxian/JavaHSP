package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(100);

        System.out.println(car);
        System.out.println(car1);
    }
}

class Car {
    double price = 10;
    static String color = "white";

    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price + "\t" + color;
    }
}
