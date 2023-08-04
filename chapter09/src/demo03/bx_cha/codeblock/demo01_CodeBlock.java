package demo03.bx_cha.codeblock;

public class demo01_CodeBlock {
    public static void main(String[] args) {
        Movie movie1 = new Movie("movie1");
        Movie movie2 = new Movie("movie2", 22);
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    // 三个构造器当中有相同的语句，冗余
    // 可以提取出来放到代码块中
    // 当我们不管调用哪个构造器，创建对象时，都会先调用代码块的内容
    {
        System.out.println("开始");
    }


    public Movie(String name) {
        // System.out.println("开始");
        System.out.println("Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        // System.out.println("开始");
        System.out.println("Movie(String name, double price)被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        // System.out.println("开始");
        System.out.println("Movie(String name, double price, String director)被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }

}