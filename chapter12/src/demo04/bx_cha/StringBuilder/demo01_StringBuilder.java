package demo04.bx_cha.StringBuilder;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_StringBuilder {
    public static void main(String[] args) {
        //1. StringBuilder 的直接父类 是 AbstractStringBuilder
        //2. StringBuilder 实现了 Serializable, 即 StringBuilder 的对象可以串行化
        //3. StringBuilder是final类，不能被继承
        //4. 在父类中 AbstractStringBuilder 有属性 char[] value,不是 final
        // 该 value 数组存放 字符串内容，引出存放在堆中的

        StringBuffer stringBuffer = new StringBuffer("hello");
    }
}
