package demo03.bx_cha.OutputStream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 请使用 FileOutputStream 在 FileOutputStreamTest.txt文件，中写入 “hello，world”.
 * 如果文件不存在，会创建文件(注意：前提是目录已经存在.)
 */
public class demo01_FileOutputStream {
    public static void main(String[] args) {

    }

    /**
     * 演示使用 FileOutputStream 将数据写到文件中,
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {

        String str = "hello java";
        byte[] buffer = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Path = "./src/demo03/bx_cha/OutputStream/FileOutputStreamTest.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //1. new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面
            fileOutputStream = new FileOutputStream(Path,true);
            //写入一个字符
            // fileOutputStream.write('a');

            // 写入一个字符串-->字节数组
            fileOutputStream.write(str.getBytes());

            // 讲buffer.length个字节，从指定的字节数组当中写入到输出流
            // fileOutputStream.write(buffer);

            // 讲buffer.length个字节，从指定的字节数组当中写入0ff-len个字节到输出流
            // fileOutputStream.write(buffer, 0, 5);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
