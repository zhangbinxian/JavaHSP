package demo07.bx_cha.transformation;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 中文乱码问题
 */
public class demo01_CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取Src.txt 文件到程序
        //思路
        //1.  创建字符输入流 BufferedReader [处理流]
        //2. 使用 BufferedReader 对象读取Src.txt
        //3. 默认情况下，读取文件是按照 utf-8 编码

        //InputStreamReader
        //OutputStreamWriter
    }

    @Test
    public void read() throws IOException {
        String filePath = "./src/demo07/bx_cha/transformation/Src.txt";//此文件是GBK
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容: " + s);
        br.close();

        //InputStreamReader
        //OutputStreamWriter
    }
}
