package demo01.bx_cha.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 获取文件信息
 * - getName
 * - getAbsolutePath
 * - getParent
 * - length
 * - exists
 * - isFile
 * - isDirectory
 */
public class demo02_FileInformation {
    public static void main(String[] args) {

    }

    // 获取文件信息
    @Test
    public void getInformation() {
        File file = new File(".\\src\\demo01\\bx_cha\\file\\newFile01.txt");
        System.out.println(file.getName());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.getParent());

        System.out.println(file.length());

        System.out.println(file.exists());

        System.out.println(file.isFile());

        System.out.println(file.isDirectory());
    }
}
