public class demo08_Recursion {
    public static void main(String[] args) {
        demo08_T t = new demo08_T();
        t.test(4);
        //换行
        System.out.println();
        //阶乘
        int n = t.factorial(3);
        System.out.println("3!= " + n);
        //阶乘的和
        int s = 0;
        for (int i = 1; i <= 4; i++) {
            //1!+2!+3!+...+(n-1)!+n!;
            s += t.factorial(i);
        }
        System.out.println("5!+4!+3!+2!+1!= " + s);

        //斐波拉契数
        int fibonacci = t.Fibonacci(9);
        System.out.println("Fibonacci 9 = " + fibonacci);

        System.out.println();
        int peach=t.monkeyEatPeach(6);
        System.out.println(peach);
    }
}

class demo08_T {
    public void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n=" + n);

    }

    public int factorial(int n) {
        //阶乘
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public int Fibonacci(int n) {
        //1,1,2,3,5,8,13,21,34...

        //n=1 1
        //n=2 1
        //n>2 (n-1)+(n-2)
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
    public int monkeyEatPeach(int day){
        //猴子们每天吃桃子的一半，小猴子再偷吃一个，等于每天都吃前一天剩余桃子的一半加一个，知道第十天只剩一个桃子。
        //day=10 1
        //day=9 (day10+1)*2=4
        //day=8 (day9+1)*2=10
        //前一天的桃子=(后一天的桃子+1)*2
        if(day==10){
            return 1;
        }else if(day>0&&day<10){
            //前一天的桃子=(后一天的桃子+1)*2
            //今天桃子=(昨天桃子/2）-1
            //昨天桃子=((今天日期+1)+1)*2
            return (monkeyEatPeach(day+1)+1)*2;
        }
        return -1;
    }
}