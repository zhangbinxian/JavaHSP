public class demo05_swap {
    public static void main(String[] args) {
        //成员方法传参机制
        int a = 12;
        int b = 21;
        AA aa = new AA();
        aa.swap(a, b);
        //形参的改变,不影响实参
        System.out.println("main当中a=" + a + ",b=" + b);
    }
}

class AA {
    public void swap(int a, int b) {
        System.out.println("交换前a=" + a + ",b=" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("交换后a=" + a + ",b=" + b);
    }
}