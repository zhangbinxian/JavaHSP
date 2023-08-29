package demo06.bx_cha.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_ArraysExercise {
    public static void main(String[] args) {
        /**
         * 案例：自定义 Book 类，里面包含 name 和 price，按 price 排序(从大到小)。
         * 要求使用两种方式排序 , 有一个 Book[] books = 4 本书对象.
         * 使用前面学习过的传递 实现 Comparator 接口匿名内部类，也称为定制排序。
         *
         * 可以按照 price (1)从大到小 (2)从小到大
         * (3) 按照书名长度从大到小
         */

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃", 300);

        // 从小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double prizeVal = book1.getPrize() - book2.getPrize();

                // 这里老师进行了一个转换，重写compare函数，但是返回值要求是int，而价格是double
                //如果发现返回结果和我们输出的不一致，就修改一下返回的 1 和 -1
                if (prizeVal < 0) {
                    return -1;
                } else if (prizeVal > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));


        // 从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double prizeVal = book2.getPrize() - book1.getPrize();

                if (prizeVal < 0) {
                    return -1;
                } else if (prizeVal > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));


        // name从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book2.getName().length() - book1.getName().length();


            }
        });
        System.out.println(Arrays.toString(books));
    }


}

class Book {
    private String name;
    private double prize;

    public Book(String name, double prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }


    public String toString() {
        return "name=" + name + ",prize=" + prize+";\t";
    }
}
