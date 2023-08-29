package demo03.bx_cha.StringBuffer;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hello");
        //增加
        s.append(",");
        s.append("world");
        s.append("1").append("2").append("3");
        System.out.println(s);

        // 删除
        // 删除下标[10,15)之间的内容
        s.delete(10,15);
        System.out.println(s);

        // 改(替换)
        // 替换，使用world，替换下标0~5的内容
        s.replace(0,5,"world");
        System.out.println(s);

        // 查
        // 查找指定子串第一次出现的位置，找不到返回-1
        int index = s.indexOf("wo");
        System.out.println(index);

        // 插
        // 在指定位置插入字符串,原先的内容往后移动
        s.insert(6,"hello,");
        System.out.println(s);

        // 长度
        System.out.println(s.length());
    }
}
