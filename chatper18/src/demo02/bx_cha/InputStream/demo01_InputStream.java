package demo02.bx_cha.InputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * FileInputStream的使用
 */
@SuppressWarnings({"all"})
public class demo01_InputStream {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b)
     */
    @Test
    public void readFile01() {

        String path = "./src/demo02/bx_cha/InputStream/FileInputStreamTest.txt";

        int readDate = 0;

        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(path);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            //如果返回-1 , 表示读取完毕
            while ((readDate = fileInputStream.read()) != -1) {
                System.out.print((char) readDate);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用 read(byte[] b) 读取文件，提高效率
     */
    @Test
    public void readFile02() {

        String path = "./src/demo02/bx_cha/InputStream/FileInputStreamTest.txt";
        int readLength = 0;

        byte[] buffer = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(path);

            //从该输入流读取最多 b.length 字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //如果返回-1 , 表示读取完毕
            //如果读取正常, 返回实际读取的字节数
            while ((readLength = fileInputStream.read(buffer)) != -1) {

                // 使用String构造器
                // String(byte bytes[], int offset, int length)
                System.out.print(new String(buffer, 0, readLength));

                // for (int i = 0; i < readLength; i++) {
                //     System.out.print((char) buffer[i]);
                // }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
