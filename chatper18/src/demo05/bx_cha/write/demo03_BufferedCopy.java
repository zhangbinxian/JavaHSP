package demo05.bx_cha.write;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author bx_cha
 * @version 1.0
 *
 * 字节流可以操作二进制文件，可以操作文本文件吗？当然可以
 */
public class demo03_BufferedCopy {
    public static void main(String[] args) {

    }

    //1. BufferedReader 和 BufferedWriter 是按照字符操作
    //2. 不要去操作 二进制文件[声音，视频，doc, pdf ], 可能造成文件损坏
    @Test
    public void BufferedCopyFile() {
        String Src = "./src/demo05/bx_cha/write/CopyFileSrc/copySrcFile.txt";
        String Desc = "./src/demo05/bx_cha/write/CopyFileDesc/copyDescFile.txt";

        BufferedReader bf = null;
        BufferedWriter bw = null;

        String line;

        try {
            bf = new BufferedReader(new FileReader(Src));
            bw = new BufferedWriter(new FileWriter(Desc));
            if ((line = bf.readLine()) != null) {

                bw.write(line);
                bw.newLine();//换行
            }
            System.out.println("Copy Over");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭io
                if (bf != null) {
                    bf.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
