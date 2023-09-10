package demo14.bx_cha.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_homework {
    public static void main(String[] args) {
        /**
         * 使用ArrayList 完成对 对象 Car {name, price} 的各种操作
         * 1.add:添加单个元素
         * 2.remove:删除指定元素
         * 3.contains:查找元素是否存在
         * 4.size:获取元素个数
         * 5.isEmpty:判断是否为空
         * 6.clear:清空
         * 7.addAll:添加多个元素
         * 8.containsAll:查找多个元素是否都存在
         * 9.removeAll：删除多个元素
         * 使用增强for和 迭代器来遍历所有的car , 需要重写 Car 的toString方法
         */

        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("car1", 20000);
        Car car2 = new Car("car2", 200000);

        // add:添加单个元素
        arrayList.add(car1);
        arrayList.add(car2);
        System.out.println(arrayList);

        // remove:删除指定元素
        arrayList.remove(car1);
        System.out.println(arrayList);

        // contains:查找元素是否存在
        System.out.println(arrayList.contains(car1));

        // size:获取元素个数
        System.out.println(arrayList.size());

        // isEmpty:判断是否为空
        System.out.println(arrayList.isEmpty());

        // clear:清空
        arrayList.clear();
        System.out.println(arrayList);


        ArrayList list = new ArrayList();
        list.add(car1);
        list.add(car1);
        list.add(car2);

        // addAll:添加多个元素
        arrayList.addAll(list);
        System.out.println(arrayList);

        // containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));

        // removeAll：删除多个元素
        list.removeAll(arrayList);
        System.out.println(list);


        System.out.println("使用增强for");
        for (Object car : arrayList) {
            System.out.println(car);
        }

        System.out.println("使用迭代器");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object car = iterator.next();
            System.out.println(car);
        }
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}