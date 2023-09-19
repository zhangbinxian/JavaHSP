package demo07.bx_cha.transformation;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 演示 OutputStreamWriter 使用
 * 把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理的编码 gbk/utf-8/utf8
 */
public class demo03_OutputStream {
    public static void main(String[] args) {

    }

    @Test
    public void write() throws IOException {
        String filePath = "./src/demo07/bx_cha/transformation/Desc.txt";//此文件是GBK

        //1. 把 FileOutputStream 转成 OutputStreamWriter
        //2. 指定编码 gbk
        //   OutputStreamWriter outputStreamWriter = new OutputStreamWriter(FileOutputStream(filePath), "GBK");
        //3. outputStreamWriter.write()

        /**
         * 1. 通过路径，得到字节输入流FileOutputStream
         * 2. 字节输入流FileOutputStream--> 转换流OutputStreamWriter，并指定编码格式
         * 3. 转换流OutputStreamWriter.write()写入内容
         */

        FileOutputStream fos = new FileOutputStream(filePath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos, "GBK");

        // 简写
        // OutputStreamWriter outputStreamWriter = new OutputStreamWriter(FileOutputStream(filePath), "GBK");

        // 写入
        outputStreamWriter.write("hello Java, Java是世界上最好的语言");
        // 关闭
        outputStreamWriter.close();
        System.out.println("Write Over");

    }
}
