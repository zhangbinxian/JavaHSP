package demo10.bx_cha.homework;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_homework02 {
    public static void main(String[] args) {

        /**
         * 要求:  使用BufferedReader读取一个文本文件，为每行加上行号，
         * 再连同内容一并输出到屏幕上。
         */
    }

    @Test
    public void readAndDisplay() {

        String path = ".\\src\\demo10\\bx_cha\\homework\\mytemp\\hello2.txt";

        BufferedReader br = null;

        String line = "";
        int lineNum = 0;
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                System.out.println(++lineNum + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}