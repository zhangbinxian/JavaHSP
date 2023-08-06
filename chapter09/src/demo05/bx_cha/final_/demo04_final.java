package demo05.bx_cha.final_;

public class demo04_final {
    public static void main(String[] args) {

    }
}
// 我们不希望某个局部变量被修改,使用final修饰
class F {
    public void Num() {
        final double NUM = 0.1;

        // 修改NUM为0.2
        // NUM = 0.2;
        System.out.println("NUM" + NUM);
    }
}
