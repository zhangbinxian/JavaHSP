package demo04.bx_cha.reader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 演示 bufferedReader 使用
 */
public class demo02_BufferReader {
    public static void main(String[] args) {

    }

    @Test
    public void BufferReader01_() {
        String path = "./src/demo04/bx_cha/reader/BufferReader.txt";

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //读取
        String line;//按行读取,效率高

        //1. bufferedReader.readLine() 是按行读取文件
        //2. 当返回 null 时，表示文件读取完毕

        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 关闭流
        //关闭流, 这里注意，只需要关闭 BufferedReader ，因为底层会自动的去关闭 节点流
        /*
        public void close () throws IOException {
            synchronized (lock) {
                if (in == null)
                    return;
                try {
                    in.close();//in 就是我们传入的 new FileReader(filePath), 关闭了.
                    } finally {
                    in = null;
                    cb = null;
                }
            }
        }
        */ finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}