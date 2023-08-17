package demo01.bx_cha.exception;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo15_homework01 {
    public static void main(String[] args) {


        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("args参数数量有误");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);


            double res = n1 / n2;

            System.out.println("argc1/argc2=" + res);

            if (n2 == 0) {
                throw new ArithmeticException("除数!=0");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式有误");
        } catch (ArithmeticException e) {
            System.out.println("除数！=0");
        }

    }

    public double calc(int n1, int n2) {
        return n1 / n2;
    }
}
