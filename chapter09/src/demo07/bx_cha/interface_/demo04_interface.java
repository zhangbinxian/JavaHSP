package demo07.bx_cha.interface_;

public class demo04_interface {
    public static void main(String[] args) {

        littleMonkey littleMonkey = new littleMonkey("wuKong");
        littleMonkey.climbing();
        littleMonkey.fly();
        littleMonkey.swim();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(name+"会爬树");
    }
}
// littleMonkey继承了父类Monkey,实现了接口Fish，Bird
class littleMonkey extends Monkey implements Fish,Bird{
    public littleMonkey(String name) {
        super(name);
    }


    @Override
    public void swim() {
        System.out.println(getName()+"学会了游泳");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"学会了飞翔");
    }
}
interface Fish{
    void swim();
}
interface  Bird{
    void fly();
}