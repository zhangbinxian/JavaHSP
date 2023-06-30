public class demo12_OverLoad {
    public static void main(String[] args) {
        //方法重载 方法名一致，参数不同(类型，个数，顺序),

        //参数名称无要求，返回类型无要求
        myCalc mycalc = new myCalc();
        mycalc.calc(10, 20);
        mycalc.calc(10, 20, 30);
        mycalc.calc(15.5, 20);
        mycalc.calc(1, 0.9);
    }
}

class myCalc {
    public void calc(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void calc(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    public void calc(int n1, double n2) {
        System.out.println(n1 + n2);
    }

    public void calc(double n1, int n2) {
        System.out.println(n1 + n2);
    }
}
