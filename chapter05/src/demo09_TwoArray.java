public class demo09_TwoArray {
    public static void main(String[] args) {
        //要一个数组 存放以下数据
        // 1
        // 2,2
        // 3,3,3
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int[i + 1];

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        //输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
