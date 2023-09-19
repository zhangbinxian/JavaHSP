package demo04.bx_cha.reader;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 使用 FileReader 从 FileReader.txt 读取内容，并显示
 */
@SuppressWarnings({"all"})
public class demo01_FIleReader {
    public static void main(String[] args) {

    }

    @Test
    public void Filereader01_() {
        String path = "./src/demo04/bx_cha/reader/FileReader.txt";
        FileReader fIlereader = null;

        int data = 0;

        try {
            fIlereader = new FileReader(path);
            while ((data = fIlereader.read()) != -1) {
                // 按 字符 读取
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                // 关闭
                if (fIlereader != null) {
                    fIlereader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void Filereader02_() {
        String path = "./src/demo04/bx_cha/reader/FileReader.txt";
        FileReader fIlereader = null;

        int readLnegth = 0;
        char[] buff = new char[8];

        try {
            fIlereader = new FileReader(path);
            while ((readLnegth = fIlereader.read(buff))!=-1) {
                // 按 字符 读取
                System.out.print(new String(buff,0,readLnegth));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                // 关闭
                if (fIlereader != null) {
                    fIlereader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

