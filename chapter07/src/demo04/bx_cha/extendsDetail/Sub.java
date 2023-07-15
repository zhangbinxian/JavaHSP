package demo04.bx_cha.extendsDetail;

public class Sub extends Base {

    public Sub() {
        super("tom1");//默认调用父类的无参构造器
        System.out.println("子类Sub()构造器被调用");
    }
    public Sub(String name) {
        super("tom2");
        System.out.println("子类Sub(String name)构造器被调用");
    }
    public Sub(String name,int age) {
        //1. 调用父类的无参构造器
        // super();
        //2. 调用父类的1参构造器
        // super("zbx");
        //3. 调用父类的2惨构造器
        super("tom2",20);
        System.out.println("子类Sub(String name,int age)构造器被调用");
    }
    public void sayOk() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        //n4是在父类当中私有private，无法在子类之间访问
        // System.out.println(n4);

        //getn4()是父类提供的共有方法，用于间接访问n4
        System.out.println("getn4()是父类提供的共有方法，用于间接访问n4,n4=" + getn4());

        test100();
        test200();
        test300();
        //test400()是在父类当中私有private方法，无法在子类之间访问
        // test400();

        //callTest400()是父类提供的共有方法，用于间接访问方法test400()
        System.out.println("callTest400()是父类提供的共有方法，用于间接访问方法test400()");
        callTest400();

    }
}
