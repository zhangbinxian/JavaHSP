public class demo03_ArrayCopy {
    public static void main(String[] args) {
        //数组拷贝，拷贝到arr2数组，要求数组空间独立
        int[] arr1 = {1, 2, 3};

        //创建新数组
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }

        arr1[1]=20;
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);

        arr2[0]=10;
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
        System.out.println(arr2[0] + " " + arr2[1] + " " + arr2[2]);

    }
}
