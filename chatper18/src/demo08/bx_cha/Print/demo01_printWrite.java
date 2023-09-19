package demo08.bx_cha.Print;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * printWrite 字符打印流
 */
public class demo01_printWrite {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);

        pw.print("你好");

        //flush + 关闭流, 才会将数据写入到文件
        pw.close();
    }

    @Test
    public void printToFile() throws IOException {
        String path = ".\\src\\demo08\\bx_cha\\Print\\print2.txt";
        PrintWriter pw = new PrintWriter(new FileWriter(path));
        pw.print("你好2");
        pw.close();
    }
}
