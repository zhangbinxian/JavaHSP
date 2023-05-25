public class demo04_ArrayReverse {
    public static void main(String[] args) {
        //数组反转
        int[] arr1 = {66, 55, 44, 33, 22, 11, 0};
        ArrayReverse1(arr1);
        ArrayReverse2(arr1);

    }

    public static void ArrayReverse1(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        int len = arr1.length;
        System.out.println("array.length " + len);    //6

        for (int i = 0; i < len; i++) {
            arr2[len - 1 - i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    public static void ArrayReverse2(int[] arr1) {
        int len = arr1.length;
        System.out.println("array.length " + len);    //6
        for (int i = 0; i < len / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[len - 1 - i];
            arr1[len - i - 1] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
