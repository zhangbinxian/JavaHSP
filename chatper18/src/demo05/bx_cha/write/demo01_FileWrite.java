package demo05.bx_cha.write;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 使用 FileWriter 将 “风雨之后，定见彩虹” 写入到 FIleWrite.txt 文件中, 注意细节.
 */
public class demo01_FileWrite {
    public static void main(String[] args) {

    }

    @Test
    public void FileWrite01_() {

        String str = "hello world";
        char[] chars = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String path = "./src/demo05/bx_cha/write/FileWrite.txt";
        FileWriter fileWriter = null;

        try {
            // 覆盖模式
            fileWriter = new FileWriter(path);

            // 追加模式
            // fileWriter = new FileWriter(path, true);

            // 3) write(int):写入单个字符
            fileWriter.write('h');

            // 4) write(char[]):写入指定数组
            fileWriter.write(chars);
            //
            // 5) write(char[],off,len):写入指定数组的指定部分
            fileWriter.write(str.toCharArray(), 0, 5);
            //
            // // 6) write（string）：写入整个字符串
            fileWriter.write("写入字符串");
            //
            // // 7) write(string,off,len):写入字符串的指定部分
            fileWriter.write("上海天津", 0, 2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {

                    /**
                     * 要刷新，或者关闭，或者无法写入到文件当中
                     *
                     * 关闭文件流，等价 flush() + 关闭
                     */
                    // fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Over");

    }
}
