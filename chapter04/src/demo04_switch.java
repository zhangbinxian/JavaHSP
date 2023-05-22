public class demo04_switch {
    public static void main(String[] args) {
        // break语句用来执行完一个case分支后，使程序跳出switch，如果没有break，则会顺序执行到switch结尾，除非遇到一个break
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("1");
                //没有break
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }
    }
}
