package demo03.bx_cha.OutputStream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_BufferedCopy {
    public static void main(String[] args) {

    }

    @Test
    public void BufferedCopyFile() {
        String Src = "./src/demo03/bx_cha/OutputStream/CopyFileSrc/BufferedCopySrc.png";
        String Desc = "./src/demo03/bx_cha/OutputStream/CopyFileDesc/BufferedCopyDesc.png";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;


        byte[] buffer = new byte[1024];
        int readLen = 0;

        try {
            //因为 FileInputStream  是 InputStream 子类
            bis = new BufferedInputStream(new FileInputStream(Src));
            bos = new BufferedOutputStream(new FileOutputStream(Desc));


            //当返回 -1 时，就表示文件读取完毕
            while ((readLen = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, readLen);
            }
            System.out.println("Copy Over");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流 , 关闭外层的处理流即可，底层会去关闭节点流
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
