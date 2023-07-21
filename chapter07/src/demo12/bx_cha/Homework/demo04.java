package demo12.bx_cha.Homework;

public class demo04 {
    public static void main(String[] args) {

        putongEmployee putong = new putongEmployee("putong", 200, 30);
        menagerEmployee menager = new menagerEmployee("menager", 100, 30,1000);

        System.out.println(putong.toString());
        System.out.println(menager.toString());
    }
}

class employee {
    private String name;
    private double salary;
    private int days;

    public employee(String name, double salary, int days) {
        this.name = name;
        this.salary = salary;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "name=" + name + " days=" + days + " onedaySalary=" + salary;
    }
}

class putongEmployee extends employee {


    public putongEmployee(String name, double salary, int days) {
        super(name, salary, days);
    }

    @Override
    public String toString() {
        return super.toString() + " Allsalary=" + getDays() * getSalary() * 1.0;
    }
}

class menagerEmployee extends employee {
    private double bonus;

    public menagerEmployee(String name, double salary, int days, double bonus) {
        super(name, salary, days);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " Allsalary=" + (bonus + (getDays() * getSalary() * 1.2));
    }
}