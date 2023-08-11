package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo09_try_catch_finally {

    public static void main(String[] args) {

        //1.如果 try 代码块有可能有多个异常
        //2.可以使用多个 catch 分别捕获不同的异常，相应处理
        //3.要求子类异常写在前面，父类异常写在后面
        try {
            Person person = new Person();
            // person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("算术异常=" + e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}
