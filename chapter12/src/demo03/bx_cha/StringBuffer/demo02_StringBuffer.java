package demo03.bx_cha.StringBuffer;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_StringBuffer {
    public static void main(String[] args) {
        // 构造器的使用

        // 创建一个大小为16的char[]，用于存放字符内容
        StringBuffer stringBuffer=new StringBuffer();

        // 通过构造器指定char[]大小
        StringBuffer stringBuffer1=new StringBuffer(100);

        // 通过给一个String创建StringBuffer,char[]大小是str.length()+16
        StringBuffer hello=new StringBuffer("hello");

    }
}
