public class demo13_VarParameter {
    //可变参数
    //java允许将同一个类当中，多个同名同功能，单参数个数不同的方法，封装成一个方法

    // 可变参数的实参可以是任意个
    // 可变参数的实参可以是数组
    // 可变参数的本质就是数组
    // 一个参数列表只能有一个可变参数
    // 可变参数和普通参数一起放在参数列表时，必须保证可变参数在最后
    public static void main(String[] args) {
        Method m = new Method();
        int sum = 0;
        sum = m.sum();
        System.out.println(sum);
        sum = m.sum(1, 10, 20);
        System.out.println(sum);

    }
}

class Method {
    // public int sum(int n1, int n2) {
    //     return n1 + n2;
    // }
    //
    // public int sum(int n1, int n2, int n3) {
    //     return n1 + n2 + n3;
    // }
    //
    // public int sum(int n1, int n2, int n3, int n4) {
    //     return n1 + n2 + n3 + n4;
    // }
    //...,以上三个方法名称相同，功能相同，参数个数不同
    //可以使用可变参数优化

    //int...表示接受的可变参数，类型是int，可以接受多个int(0-n个)
    //使用可变参数时，可以当数组来使用，即nums可以当数组
    public int sum(int... nums) {
        int sum = 0;
        System.out.println("接受参数个数为:" + nums.length);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}