package demo02.bx_cha.List;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


/**
 * @author bx_cha
 * @version 1.0
 */

public class demo04_ListExercise2 {

    public static void main(String[] args) {
        // List list = new Vector();
        // List list=new LinkedList();
        List list = new ArrayList();

        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 19, "施耐庵"));
        list.add(new Book("三国", 80, "罗贯中"));
        list.add(new Book("西游记", 10, "吴承恩"));

        System.out.println("=================排序前=================");
        for (Object o : list) {
            System.out.println(o);
        }
        Bubblesort(list);
        System.out.println("=================排序后=================");
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void Bubblesort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                // 取出对象Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);

                if (book1.getPrize() > book2.getPrize()) {
                    /**
                     *  错误写法
                     *  Book tempBook = book1;
                     *  book1 = book2;
                     *  book2 = tempBook;
                     */

                    list.set(j, book2);
                    list.set(j + 1, book1);
                }

            }
        }
    }
}
class Book {
    private String name;
    private double prize;
    private String author;

    public Book(String name, double prize, String author) {
        this.name = name;
        this.prize = prize;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称: " + getName() + "\t" + "价格: " + getPrize() + "\t" + "作者: " + getAuthor() + "\n";
    }
}