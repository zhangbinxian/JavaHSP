package demo01.bx_cha.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        // System.out.println("col="+col);

        // 迭代器
        Iterator iterator = col.iterator();
        // hasNext() 判断是否还有下一个

        /**
         * 快速生成while(迭代器)快捷键
         * itit
         */
        while (iterator.hasNext()) {

            // next() 指针下移，并返回下一个元素，类型是Object
            Object object = iterator.next();
            System.out.println("Obj=" + object);
        }
        //3. 当退出 while 循环后 , 这时 iterator 迭代器，指向最后的元素
        // iterator.next();//NoSuchElementException

        //4. 如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();

        System.out.println("==============第二次遍历==============");
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println("Obj=" + object);
        }
    }

}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}