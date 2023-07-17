package demo05.bx_cha.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //?-> 按照查找关系来返回信息
        // 1.看子类是否有该属性
        // 2.如果子类有这个属性，并且可以访问，则返回信息
        // 3.如果子类没有这个属性，就查看父类有没有这个属性(如果父类有这个属性，并且可以访问，则返回信息)
        // 4.如果父类没有，就按照3的规则，继续查找上级父类，直到Object
        System.out.println(son.name);
        System.out.println();
    }
}

class GrandPa {
    String name = "爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "爸爸";
    int age = 40;
}

class Son extends Father {
    String name = "儿子";
}