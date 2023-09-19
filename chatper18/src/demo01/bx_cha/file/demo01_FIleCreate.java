package demo01.bx_cha.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 创建文件的几种方式
 */
public class demo01_FIleCreate {
    public static void main(String[] args) {

    }


    // 方式1 new File(String path)
    @Test
    public void create01() throws IOException {

        // 当前目录在chapter18
        String filePath = ".\\src\\demo01\\bx_cha\\file\\newFile01.txt";

        File file = new File(filePath);

        // 创建文件
        file.createNewFile();
        System.out.println("文件创建成功");
    }

    // 方式2 new File(File parent,String child)
    // 根据父目录文件+子路径构建
    @Test
    public void create02() throws IOException {
        File parentFile = new File(".\\src\\demo01\\bx_cha\\file");
        String fileName = "newFile02.txt";

        File file = new File(parentFile, fileName);

        // 创建文件
        file.createNewFile();
        System.out.println("文件创建成功");

    }

    // 构建父目录+子路径构建
    @Test
    public void create03() throws IOException {
        String parentPath = ".\\src\\demo01\\bx_cha\\file";
        String fileName = "newFile03.txt";

        File file = new File(parentPath, fileName);
        // 创建文件
        file.createNewFile();
        System.out.println("文件创建成功");

    }

}
