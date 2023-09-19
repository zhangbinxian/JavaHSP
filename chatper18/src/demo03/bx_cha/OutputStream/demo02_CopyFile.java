package demo03.bx_cha.OutputStream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_CopyFile {
    public static void main(String[] args) {
        //完成 文件拷贝
        // 将Koala.jpg 从CopyFileSrc\\sstx.png
        // 拷贝到CopyFileDesc\\sstx.png


    }

    @Test
    public void copyFile() {
        String Src = ".\\src\\demo03\\bx_cha\\OutputStream\\CopyFileSrc\\sstx.png";
        String Desc = ".\\src\\demo03\\bx_cha\\OutputStream\\CopyFileDesc\\sstx.png";

        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            fis = new FileInputStream(Src);
            fos = new FileOutputStream(Desc);

            int readLength = 0;
            //定义一个字节数组,提高读取效果
            byte[] buffer = new byte[1024];

            while ((readLength = fis.read(buffer)) != -1) {
                //一定要使用这个方法
                fos.write(buffer, 0, readLength);
            }
            System.out.println("copy over");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输入流和输出流，释放资源
                //确保在关闭流之前检查流对象是否为空。
                // 这是因为在 Java 中，如果尝试关闭一个为空的流，会导致 NullPointerException 异常
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
