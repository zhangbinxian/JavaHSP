package demo06.bx_cha.Set;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo07_HashSetExercise {
    public static void main(String[] args) {

        /**
         * 定义一个employee类，包含private属性的成员，name，sale，age，birthday(Mydate类)，
         * birthday为Mydate类，包含属性 year，month，day
         *
         * 创建4个employee对象，放入hashset
         * 当name，和birthday的值相同时，认为是相同员工，不能添加到hashset集合当中
         */

        HashSet hashSet = new HashSet();
        hashSet.add(new employee("zbx", 2000, 20, new Mydate("2000", "10", "1")));
        hashSet.add(new employee("ttl", 3000, 25, new Mydate("2000", "10", "1")));
        hashSet.add(new employee("wxy", 5000, 30, new Mydate("1990", "10", "1")));
        hashSet.add(new employee("zbx", 5000, 20, new Mydate("2000", "10", "1")));

        System.out.println(hashSet);

    }
}

class employee {
    private String name;
    private double sale;

    private int age;

    private Mydate birthday;

    public employee(String name, double sale, int age, Mydate birthday) {
        this.name = name;
        this.sale = sale;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sale=" + sale +
                ", age=" + age +
                ", birthday=" + birthday +
                '}' + "\n";
    }
}

class Mydate {
    private String year;
    private String month;
    private String day;

    public Mydate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return Objects.equals(year, mydate.year) &&
                Objects.equals(month, mydate.month) &&
                Objects.equals(day, mydate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}