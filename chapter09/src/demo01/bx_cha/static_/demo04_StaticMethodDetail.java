package demo01.bx_cha.static_;

public class demo04_StaticMethodDetail {
    public static void main(String[] args) {
        // 通过类名直接调用
        D.hi();

        // 需要new对象，再调用
        // 匿名对象调用
        new D().say();
    }
}

class D {
    private int n1 = 100;

    public void say() {
        System.out.println(this.n1);
    }

    public static void hi() {
        // 静态方法没有this参数，和super()
        // System.out.println(this.n1); //报错
    }
}