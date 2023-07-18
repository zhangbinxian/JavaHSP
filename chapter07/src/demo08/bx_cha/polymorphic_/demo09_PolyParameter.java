package demo08.bx_cha.polymorphic_;

public class demo09_PolyParameter {
    // 多态参数:形参类型是父类类型，实参类型允许是子类类型

    public static void main(String[] args) {
        Worker worker1 = new Worker("worker1", 2500);
        Manager manager1 = new Manager("manager1", 6000, 2000);


        show(worker1);
        show(manager1);

        work(worker1);
        work(manager1);
    }
    public static void show(Employee employee){
        System.out.println(employee.getAnnual());
    }

    public static void work(Employee employee){
        if(employee instanceof Worker){
            // Worker worker=(Worker)employee;  //向下转型
            // worker.work();

            // 上面两行等价于下面一行
            ((Worker) employee).work();
        }
        else if(employee instanceof Manager){
            // Manager manager=(Manager)employee;
            // manager.manager();

            ((Manager)employee).manager();
        }else {

        }
    }
}
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
    public double getAnnual(){
        return salary*12;
    }
}
class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工"+getName()+"正在工作");
    }
    public double getAnnual(){
        return super.getAnnual();
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manager(){
        System.out.println("经理"+getName()+"正在管理");
    }
    public double getAnnual(){
        return super.getAnnual()+bonus;
    }
}
