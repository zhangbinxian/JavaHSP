package demo03.bx_cha.OutputStream;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author bx_cha
 * @version 1.0
 * 演示ObjectOutputStream的使用, 完成数据的序列化
 */
public class demo04_ObjectOutputStream {
    public static void main(String[] args) {

    }

    @Test
    public void Out() {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String path = "./src/demo03/bx_cha/OutputStream/data.dat";

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            //序列化对象到data.dat

            oos.writeInt(100);// int -> Integer (实现了 Serializable)
            oos.writeBoolean(true);// boolean -> Boolean (实现了 Serializable)
            oos.writeChar('a');// char -> Character (实现了 Serializable)
            oos.writeDouble(9.5);// double -> Double (实现了 Serializable)
            oos.writeUTF("Java是世界上最好的语言");//String
            oos.writeObject(new Dog("旺财", 10,"china","棕色"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据保存完毕(序列化形式)");
    }
}

