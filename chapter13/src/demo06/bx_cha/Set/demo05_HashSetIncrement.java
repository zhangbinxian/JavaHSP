package demo06.bx_cha.Set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo05_HashSetIncrement {
    public static void main(String[] args) {

        /**
         * HashSet 底层是 HashMap, 第一次添加时，table 数组扩容到 16，
         * 临界值(threshold)是 16*加载因子(loadFactor)是 0.75 = 12
         * 如果 table 数组使用到了临界值 12,就会扩容到 16 * 2 = 32,
         * 韩顺平循序渐进学 Java 零基础
         * 第 653页
         * 新的临界值就是 32*0.75 = 24, 依次类推
         */

        HashSet hashSet = new HashSet();
        for (int i = 0; i <= 100; i++) {
            hashSet.add(i);
        }


        /**
         * 在 Java8 中, 如果一条链表的元素个数到达 TREEIFY_THRESHOLD(默认是 8 )，
         * 并且 table 的大小 >= MIN_TREEIFY_CAPACITY(默认 64),就会进行树化(红黑树),
         * 否则仍然采用数组扩容机制
         */

        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < 12; i++) {
            hashSet2.add(new A(i));
        }

        /**
         *  当我们向 hashset 增加一个元素，-> Node -> 加入 table , 就算是增加了一个 size++
         */
        HashSet hashSet3 = new HashSet();
        //在 table 的某一条链表上添加了 7 个 A 对象
        for (int i = 1; i <= 7; i++) {
            hashSet3.add(new A(i));

        }

        //在 table 的另外一条链表上添加了 7 个 B 对象
        for (int i = 1; i <= 7; i++) {
            hashSet3.add(new B(i));
        }

    }
}

class A {

    private int n;

    public A(int n) {
        this.n = n;
    }


    @Override
    public int hashCode() {
        return 100;
    }
}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}