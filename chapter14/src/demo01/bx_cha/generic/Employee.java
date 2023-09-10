package demo01.bx_cha.generic;

import java.util.Objects;

/**
 * @author bx_cha
 * @version 1.0
 */
public class Employee {
    private String name;
    private double salary;
    private MyDate myDate;

    public Employee(String name, double salary, MyDate myDate) {
        this.name = name;
        this.salary = salary;
        this.myDate = myDate;
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

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", myDate=" + myDate +
                '}';
    }
}
