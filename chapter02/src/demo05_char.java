public class demo05_char {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '张';
        char c4 = 97;
        char c5 = 'c';      //c 对应的unicode是 99

        //char 可以存放一个数字,因为char本质对应unicode就是数字 a=97


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int) c5);

        //所以char可以参与运算，相当于一个整数
        //a=97+10  107
        System.out.println('a' + 10);
    }
}
