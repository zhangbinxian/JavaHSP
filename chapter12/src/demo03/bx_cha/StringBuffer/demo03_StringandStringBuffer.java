package demo03.bx_cha.StringBuffer;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_StringandStringBuffer {
    public static void main(String[] args) {

        /**
         * String 与 StringBuffer相互转换
         *
         * 1.String-->StringBuffer
         */

        // func1，使用构造器，返回的才是StringBuffer对象，对str没有印象
        String str="hello world";
        StringBuffer stringBuffer=new StringBuffer(str);


        // func2，使用append
        StringBuffer stringBuffer1=new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        /**
         * 2.StringBuffer-->String
         */

        // func1,使用StringBuffer提供的tostring()
        StringBuffer stringBuffer2=new StringBuffer("sss");
        String s = stringBuffer2.toString();

        // func2，使用构造器来搞定
        String s1=new String(stringBuffer2);
    }
}
