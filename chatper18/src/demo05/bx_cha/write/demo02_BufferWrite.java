package demo05.bx_cha.write;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * BufferWrite的演示
 */
public class demo02_BufferWrite {
    public static void main(String[] args) {

    }

    @Test
    public void BufferWrite01_() {
        String path = "./src/demo05/bx_cha/write/BufferWrite.txt";

        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            // bufferedWriter = new BufferedWriter(new FileWriter(path,true));//追加
            bufferedWriter.write("hello java1");
            // 换行符
            // bufferedWriter.newLine();或者\n
            bufferedWriter.newLine();

            bufferedWriter.write("hello java2");
            bufferedWriter.newLine();

            bufferedWriter.write("hello java3\n");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Over");
    }
}
