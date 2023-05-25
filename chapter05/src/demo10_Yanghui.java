public class demo10_Yanghui {
    public static void main(String[] args) {

        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
        // 1 5 10 10 5 1
        // 1 6 15 20 15 6 1
        // 1 7 21 35 35 21 7 1
        // 1 8 28 56 70 56 28 8 1
        // 1 9 36 84 126 126 84 36 9 1

        //特征 每一行index[0] 和index[leng-1] 都为1
        //第3行既以下，除了第一个和最后一个数之外，arr[i][j]=arr[i-1][j-1]+arr[i-1][j]

        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            //赋值
            arr[i][0] = 1;
            arr[i][arr[i].length - 1] = 1;
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (i >= 2) {
                    //赋值
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        //打印输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
