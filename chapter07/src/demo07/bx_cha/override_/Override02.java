package demo07.bx_cha.override_;

public class Override02 {
    public static void main(String[] args) {
        // 子类的返回值类型和父类方法的返回值类型一样，或者是父类返回类型的子类。
        // 比如父类是Object，子类方法返回值类型是String。

    }
}

class Animals {
    public Object func() {
        System.out.println("Object");
        return null;
    }


}

class Dogs extends Animals {

    public String func() {
        System.out.println("String");
        return null;
    }

}