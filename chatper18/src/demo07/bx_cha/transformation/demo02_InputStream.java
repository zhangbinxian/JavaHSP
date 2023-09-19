package demo07.bx_cha.transformation;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 演示使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成字符流  InputStreamReader, 指定编码 gbk/utf-8
 */
public class demo02_InputStream {
    public static void main(String[] args) {

    }

    @Test
    public void read() throws IOException {
        String filePath = "./src/demo07/bx_cha/transformation/Src.txt";//此文件是GBK

        //1. 把 FileInputStream 转成 InputStreamReader
        //2. 指定编码 gbk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //3. 把 InputStreamReader 传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);

        /**
         * 1. 通过路径，得到字节输入流FileInputStream
         * 2. 字节输入流FileInputStream---> 转换流InputStreamReader，并指定编码格式
         * 3. 转换流InputStreamReader---> 字符处理流BufferedReader，并使用其方法读取数据
         */

        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(fis, "gbk");
        BufferedReader br = new BufferedReader(isr);

        // 简写
        // BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));

        //4. 读取
        String s = br.readLine();
        System.out.println("读取内容= " + s);
        //5. 关闭外层流
        br.close();
    }
}
