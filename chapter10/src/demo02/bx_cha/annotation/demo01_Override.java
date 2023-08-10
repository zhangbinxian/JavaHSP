package demo02.bx_cha.annotation;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Override {
    public static void main(String[] args) {

    }
}
class Father{
    public void hi(){
        System.out.println("father hi");
    }
}
class Son extends Father{

    @Override
    public void hi() {
        System.out.println("son hi");
    }
}