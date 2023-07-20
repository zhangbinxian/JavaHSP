package demo08.bx_cha.polymorphic_;

public class demo07_DynamicBinding {
    // 动态绑定
    public static void main(String[] args) {
        Aa aa = new Bb();
        System.out.println(aa.sum());
        System.out.println(aa.sum1());
    }
}

class Aa {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class Bb extends Aa {
    public int i = 20;

    // public int sum(){
    //     return getI()+20;
    // }
    // public int sum1(){
    //     return i+10;
    // }
    public int getI() {
        return i;
    }
}