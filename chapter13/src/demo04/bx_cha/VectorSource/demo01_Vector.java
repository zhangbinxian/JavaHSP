package demo04.bx_cha.VectorSource;


import java.util.Vector;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Vector {
    public static void main(String[] args) {

        Vector vector = new Vector();
        // Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);

    }
}
