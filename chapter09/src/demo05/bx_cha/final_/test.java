package demo05.bx_cha.final_;

public class test {
    public static void main(String[] args) {

        double Area;
        Circle circle1 = new Circle(2);
        Area=circle1.getArea();

        System.out.println(Area);
    }
}

class Circle {
    private double r;
    private final double PI1 = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI1 * r * r;
    }
}
