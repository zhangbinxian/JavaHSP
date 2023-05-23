public class demo10_break {
    public static void main(String[] args) {
        //Math.random() 返回一个[0.0,1.0)的随机数值
        //Math.random()*100 [0.0,100)   再+1,就是[0.0,101)
        int num99=(int)(Math.random()*100)+1;
        System.out.println(num99);
        while (true){
            num99=(int)(Math.random()*100)+1;
            System.out.println(num99);
            if(num99==99){
                break;
            }
        }

    }
}
