package demo01.bx_cha.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_Directory {
    public static void main(String[] args) {

    }

    //判断.\src\demo01\bx_cha\file\newFile04.txt，是否存在，如果存在，就删除它
    @Test
    public void m1() {
        String filePath = ".\\src\\demo01\\bx_cha\\file\\newFile04.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("文件不存在");
        }
    }

    //判断.\src\demo01\bx_cha\file\testDirectory，目录是否存在，如果存在，就删除它
    @Test
    public void m2() {
        String filePath = ".\\src\\demo01\\bx_cha\\file\\testDirectory";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("目录不存在");
        }
    }

    //判断.\src\demo01\bx_cha\file\testDirectory2，目录是否存在，如果存在，提示已存在，否则就创建它
    @Test
    public void m3() {
        String directoryPath = ".\\src\\demo01\\bx_cha\\file\\testDirectory2\\a\\b";
        File path = new File(directoryPath);
        if (path.exists()) {
            System.out.println("目录已存在");
        } else {
            if (path.mkdirs()) {
                System.out.println("目录已创建");
            }

        }
    }
}
