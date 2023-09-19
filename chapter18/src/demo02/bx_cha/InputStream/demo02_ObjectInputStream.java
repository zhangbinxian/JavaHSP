package demo02.bx_cha.InputStream;

import demo03.bx_cha.OutputStream.Dog;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 反序列化
 */
public class demo02_ObjectInputStream {
    public static void main(String[] args) {

    }

    @Test
    public void In() {
        //指定反序列化的文件
        String path = "./src/demo03/bx_cha/OutputStream/data.dat";

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(path));

            //1. 读取(反序列化)的顺序需要和你保存数据(序列化)的顺序一致
            //2. 否则会出现异常
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readChar());
            System.out.println(ois.readDouble());
            System.out.println(ois.readUTF());

            Object dog = null;
            try {
                //dog 的编译类型是 Object , dog 的运行类型是 Dog

                dog = ois.readObject();
                System.out.println("运行类型=" + dog.getClass());
                System.out.println("dog信息=" + dog);//底层 Object -> Dog

                //这里是特别重要的细节:
                //1. 如果我们希望调用Dog的方法, 需要向下转型
                //2. 需要我们将Dog类的定义，放在到可以引用的位置
                Dog dog2 = (Dog) dog;
                System.out.println(dog2.getName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
