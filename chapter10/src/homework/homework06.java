package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework06 {
    public static void main(String[] args) {
        Person xiaoLi = new Person("xiaoLi", new Horse());
        xiaoLi.passLoad();
        xiaoLi.passRiver();
    }
}

interface Vehicles {

    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("使用马通行");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("使用船通行");
    }
}

class Factory {

    private static Horse horse = new Horse();

    private Factory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }

    public void passLoad() {
        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
}