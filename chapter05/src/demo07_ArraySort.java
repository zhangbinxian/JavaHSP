public class demo07_ArraySort {
    public static void main(String[] args) {
        //Bubble Sort
        //相邻两个比较 大的数值放到最后
        //6个数值，两两比较最多5次比较，即可获得最大值
        int[] arr = {3, 10, 2, 5, 9, 11};
        arr = BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] BubbleSort(int[] arr) {
        // int[] arr = {3, 10, 2, 5, 9, 11};

        int len = arr.length;
        //len=6

        for (int i = 0; i < len - 1; i++) {
            //6数值,循环5次，即可获得最大值
            for (int j = 0; j < len - 1 - i; j++) {
                //每当确定一个最大值,i+1,j就可以少循环一次
                if (arr[j] > arr[j + 1]) {
                    //交换两个值,大的一个放后面
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
