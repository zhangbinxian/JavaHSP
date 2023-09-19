package demo08.bx_cha.Print;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 演示 PrintStream （字节打印流/输出流）
 */
public class demo02_printStream {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        out.println("hello");

        /*
        public void print (String s){
            if (s == null) {
                s = "null";
            }
            write(s);
        }
         */
        //因为 print 底层使用的是 write , 所以我们可以直接调用 write 进行打印/输出
        out.write("你好Java".getBytes());
        out.close();

        //我们可以去修改打印流输出的位置/设备
        //1. 输出修改成到 一些文件
        //2. hello 会输出到“.\src\demo08\bx_cha\Print\print.txt”


    }

    @Test
    public void writeSetOut() throws FileNotFoundException {
        //我们可以去修改打印流输出的位置/设备
        //1. 输出修改成到 一些文件
        //2. hello 会输出到“.\src\demo08\bx_cha\Print\print.txt”
        System.setOut(new PrintStream(".\\src\\demo08\\bx_cha\\Print\\print.txt"));
        System.out.println("hello");
    }
}
