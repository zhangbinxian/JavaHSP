package demo06.bx_cha.Set;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_HashSetStructure {
    public static void main(String[] args) {
        // 模拟一个HashSet的底层(HashMap 的底层结构)

        // 1.创建一个数组，数组类型是Node
        // 2. Node[] 数组称为:表
        Node[] table = new Node[16];

        // 3. 创建结点
        Node john = new Node("John", null);

        table[2] = john;
        Node jack = new Node("jack", null);
        // 将jack挂载到john后面
        john.next=jack;

        Node rose = new Node("rose", null);
        // 将rose挂载到jack后面
        jack.next=rose;

        Node lucy = new Node("lucy", null);
        table[3]=lucy;

        /**
         * 此时此刻table[],table[0]-table[15]
         *
         * table[0]=null
         * .
         * .
         * .
         * table[1]=null
         * table[2]=john-->jack-->rose
         * table[3]=lucy
         * .
         * .
         * .
         * table[14]=null
         * table[15]=null
         */
        System.out.println("table=" + table);


    }
}

// 结点 存储数据，可以指向下一个结点，从而形成链表
class Node {

    // 存放数据
    Object item;

    // 指向下一个结点
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}