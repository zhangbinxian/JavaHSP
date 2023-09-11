package demo04.bx_cha.Junit;

import org.junit.jupiter.api.Test;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Junit {
    public static void main(String[] args) {

        // 传统方法
        new demo01_Junit().m1();
        new demo01_Junit().m1();
    }

    @Test
    public void m1() {
        System.out.println("m1方法被调用");
    }

    @Test
    public void m2() {
        System.out.println("m2方法被调用");
    }
}
