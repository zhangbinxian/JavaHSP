public class demo01 {
    public static void main(String[] args) {
        System.out.println(10 / 4);
        double d1 = 10 / 4;
        System.out.println(d1);
        double d2 = 10 / 4.0;
        System.out.println(d2);
        double d3 = 10.0 / 4;
        System.out.println(d3);


        System.out.println("=============================");
        System.out.println("取模本质:a % b = a - a / b * b");
        //结果的正负值与被除数一致
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);


        System.out.println("经典面试题");
        int i = 1;
        i = i++;  //(1)temp=i,(2)i=i+1,(3)i=temp;
        System.out.println(i);

        int j = 1;
        j = ++j;  //(1)i=i+1,(2)temp=i(3)i=temp;
        System.out.println(j);

    }
}

