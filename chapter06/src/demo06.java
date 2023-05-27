public class demo06 {
    public static void main(String[] args) {
        BB bb = new BB();
        int[] Array = {1, 2, 3};
        System.out.println("原先Array");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();

        bb.array(Array);
        System.out.println("调用方法后Array");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}

class BB {
    public void array(int[] arr) {
        //修改数组内容arr[0]=200
        arr[0] = 200;
        System.out.println("修改arr[0]=200之后的arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}