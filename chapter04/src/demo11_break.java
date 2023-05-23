public class demo11_break {
    public static void main(String[] args) {
        // for (int i = 0; i <10 ; i++) {
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }


        //break 可以使用标签，指定终止那一层
        label1:
        for (int i = 1; i <= 5; i++) {
            label2:
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
                if (i == 2) {
                    // break label1;
                    break label2;
                }
            }
        }
    }
}
