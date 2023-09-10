package demo14.bx_cha.homework;

import java.util.TreeSet;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_homework {
    public static void main(String[] args) {

        //add 方法，因为 TreeSet() 构造器没有传入Comparator接口的匿名内部类
        //所以在底层 Comparable<? super K> k = (Comparable<? super K>) key;
        //即 把 Perosn转成 Comparable类型
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Persons());//ClassCastException.

    }
}
// 实现Comparable接口，重写compareto方法
class Persons implements Comparable {


    @Override
    public int compareTo(Object o) {
        // 在这里定义两个 Person 对象之间的比较规则
        // 返回负数表示当前对象小于otherPerson，返回正数表示大于，返回0表示相等
        // 你可以根据需要定义比较逻辑
        return 0;
    }
}