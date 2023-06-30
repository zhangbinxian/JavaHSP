public class demo10_HanoiTower {
    public static void main(String[] args) {
        demo10_T tower=new demo10_T();
        tower.move(3,'a','b','c');
    }
}

class demo10_T {
    //num个数，a,b,c三根柱子
    public void move(int num, char a, char b, char c) {
        //只有一个盘
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            //如果是多个盘，可以看作是两个，最下面的一个，和上面的所有盘
            //1,先移动上面所有盘到b，借助c
            move(num - 1, a, c, b);
            //2,把最下面的盘移动到c
            System.out.println(a + "->" + c);
            //3,再把b塔所有盘移动到c，借助a
            move(num - 1, b, a, c);
        }

    }
}
