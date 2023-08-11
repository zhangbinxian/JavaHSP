package demo01.bx_cha.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo12_throws {
    public static void main(String[] args) {

    }

    public void f1() throws FileNotFoundException {
        // 编译时异常
        // throws可以抛出异常列表 public void f1() throws FileNotFoundException,NullPointerException,ArithmeticException
        // throws可以抛出异常父类 public void f1() throws Exception
        // throws可以抛出具体异常 public void f1() throws FileNotFoundException

        FileInputStream fis = new FileInputStream("./demo12.txt");

    }
}
