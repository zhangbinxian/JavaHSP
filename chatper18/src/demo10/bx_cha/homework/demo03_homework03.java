package demo10.bx_cha.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_homework03 {
    public static void main(String[] args) {

        /**
         * (1) 要编写一个dog.properties   name=tom age=5 color=red
         * (2) 编写Dog 类(name,age,color)  创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化, 并输出
         * (3) 将创建的Dog 对象 ，序列化到 文件 e:\\dog.dat 文件
         */
    }

    @Test
    public void readProperties() throws IOException {

        String path = "./src/demo10/bx_cha/homework/resource/dog.properties";
        String datPath = "./src/demo10/bx_cha/homework/resource/dog.dat";

        // 对象
        Properties properties = new Properties();
        // 加载
        properties.load(new FileReader(path));

        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, Integer.parseInt(age), color);
        System.out.println(dog);

        // 序列号
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(datPath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dog对象，序列化完成...");
    }

    // 反序列化
    @Test
    public void readObjectFile() throws IOException, ClassNotFoundException {
        String datPath = "./src/demo10/bx_cha/homework/resource/dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datPath));
        Dog dog = (Dog) ois.readObject();
        System.out.println("===反序列化后 dog====");
        System.out.println(dog);
        ois.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}