public class demo01_Array {
    public static void main(String[] args) {
        int []a=new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i]=i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a "+a[i]);
        }
        double []d={1,2,3.4,4.5};
        for (int i = 0; i <d.length ; i++) {
            System.out.println("d "+d[i]);
        }

    }
}
