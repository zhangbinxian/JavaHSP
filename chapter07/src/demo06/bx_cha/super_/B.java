package demo06.bx_cha.super_;

public class B extends A {
    // - super代表父类的引用，用于访问父类的属性，方法，构造器、

    // - 访问父类的属性，但不能访问父类的private属性，super.属性名
    public void hi() {
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
        // System.out.println(super.n4);
    }

    // - 访问父类的方法，但不能访问父类的private方法，super.方法名(参数列表)
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        // super.test400();
    }

    // - 访问父类的构造器 super(参数列表)，super只能放在第一句
    public B() {
        // super();
        // super(19);
        super(19, "zbx");
    }

    public void sum() {
        System.out.println("B类当中的sum()");
        // 希望调用父类的calc方法，可以使用以下三种方法

        // 先在本类找，如果有就调用
        // 如果没有就去父类找,找到且可以访问,则调用
        // 如果在父类找到,但不能访问,则报错,cannot access
        // 如果没有找到,则继续找上上父类,依照上一条规则,直到Object,如果没找到,则提示方法不存在
        calc();
        this.calc();    //等价于calc()

        // super直接去父类找,不会在本类找,其他规则和上面一样
        super.calc();
    }
    public void calc(){
        System.out.println("B类的calc()方法");
    }
}
