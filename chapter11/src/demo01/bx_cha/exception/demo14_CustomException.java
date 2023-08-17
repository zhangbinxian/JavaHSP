package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo14_CustomException {
    public static void main(String[] args) {
        int age = 10;
        // 要求age在18-50之间，否则抛出异常
        if (!(age >= 18 && age <= 60)) {
            throw new AgeException("age范围有误");
        }
        System.out.println("age范围正确");

    }
}
// 自定义异常

// 一般情况下，我们自定义异常是继承 RuntimeException，
// 即把自定义异常做成 运行时异常，好处时，我们可以使用默认的处理机制
// 即比较方便
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
