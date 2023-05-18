public class demo1_HelloWorld {
    //有几个class类 编译之后就有几个.class 文件
    //可以使用java dog单独运行dog.class或cat.class
    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}

class dog {
    public static void main(String[] args) {
        System.out.println("dog");
    }
}

class cat {
    public static void main(String[] args) {
        System.out.println("cat");
    }
}
