package demo10.bx_cha.homework;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_homework01 {
    public static void main(String[] args) {

        /**
         * path=".\src\demo10\bx_cha\homework"
         *(1) 在判断path下是否有文件夹mytemp ,如果没有就创建mytemp
         *(2) 在path\\mytemp 目录下, 创建文件 hello.txt
         *(3) 如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         *(4) 并且在hello.txt 文件中，写入 hello,world~

         */
    }

    @Test
    public void createFile() throws IOException {

        String path = ".\\src\\demo10\\bx_cha\\homework\\mytemp";
        File file = new File(path);

        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("文件夹创建成功");
            } else {
                System.out.println("文件夹创建失败");
            }
        }

        file = new File(path, "hello.txt");
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("创建成功");

                BufferedWriter bw = new BufferedWriter(new FileWriter(path+"\\hello.txt"));
                bw.write("hello,world~");
                bw.close();

            } else {
                System.out.println("创建失败");
            }
        } else {
            //如果文件已经存在，给出提示信息
            System.out.println(" 已经存在，不在重复创建...");
            BufferedWriter bw = new BufferedWriter(new FileWriter(path+"\\hello.txt"));
            bw.write("hello,world~");
            bw.close();
        }
    }
}