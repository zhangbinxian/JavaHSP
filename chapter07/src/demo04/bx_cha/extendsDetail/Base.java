package demo04.bx_cha.extendsDetail;

public class Base {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base() {
        System.out.println("父类Base()构造器被调用");
    }

    public Base(String name) {
        System.out.println("父类Base(String name)构造器被调用");
    }

    public Base(String name,int age) {
        System.out.println("父类Base(String name,int age)构造器被调用");
    }

    //public 方法，提供给子类间接访问n4
    public int getn4(){
        return n4;
    }
    public void test100() {
        System.out.println("test100");
    }

    protected void test200() {
        System.out.println("test200");
    }

     void test300() {
        System.out.println("test300");
    }

    private void test400() {
        System.out.println("test400");
    }

    //public 方法，提供给子类间接访问方法test400
    public void callTest400(){
        test400();
    }
}
