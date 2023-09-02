package demo05.bx_cha.LinkedListSource;

import java.util.LinkedList;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_LinkedList {
    public static void main(String[] args) {

        //模拟一个简单的双向链表

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");

        //连接三个结点，形成双向链表
        // a -> b -> c
        a.next = b;
        b.next = c;
        // c -> b -> a
        c.pre = b;
        b.pre = a;

        Node first = a;//让 first 引用指向 a,就是双向链表的头结点
        Node last = c; //让 last 引用指向 c,就是双向链表的尾结点

        //演示，从头到尾进行遍历
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }

        //演示，从尾到头的遍历
        System.out.println("====从尾到头的遍历====");
        while (true) {
            if (last == null) {
                break;
            }
            //输出 last 信息
            System.out.println(last);
            last = last.pre;
        }

        //演示链表的添加对象/数据，是多么的方便
        //要求，是在 a--b插入一个对象 smith
        //1. 先创建一个 Node 结点，name 就是 a1
        Node a1 = new Node("a1");
        //下面就把 a1 加入到双向链表了

        a1.next = b;
        a1.pre = a;

        a.next = a1;
        b.pre = a1;

        //让 first 再次指向 jack,上一次已经到最后的.next ==null
        first = a;
        //让 last 重新指向最后一个结点
        last = c;

        System.out.println("===重新从头到尾进行遍历===");
        while (true) {
            if (first == null) {
                break;
            }
            //输出 first 信息
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义一个 Node 类，Node 对象 表示双向链表的一个结点
class Node {
    public Object item; //真正存放数据
    public Node next; //指向后一个结点
    public Node pre; //指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name=" + item;
    }
}