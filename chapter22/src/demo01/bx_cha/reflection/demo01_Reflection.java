package demo01.bx_cha.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 */
@SuppressWarnings("all")
public class demo01_Reflection {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("chapter22/src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();


        //3. 使用反射机制解决
        Class clazz = Class.forName(classfullpath);

        // Object o = clazz.newInstance();//以过时
        Object o = clazz.getDeclaredConstructor().newInstance();

        Method method1 = clazz.getMethod(method);

        System.out.println("=============================");
        method1.invoke(o);

        //java.lang.reflect.Field: 代表类的成员变量, Field对象表示某个类的成员变量
        //得到name字段
        //getField不能得到私有的属性
        Field nameField = clazz.getField("age"); //
        System.out.println(nameField.get(o)); // 传统写法 对象.成员变量 , 反射 :  成员变量对象.get(对象)

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor对象表示构造器
        Constructor constructor = clazz.getConstructor(); //()中可以指定构造器参数类型, 返回无参构造器
        System.out.println(constructor);//Cat()


        Constructor constructor2 = clazz.getConstructor(String.class, int.class); //传入的 String.class, int.class 就是形参类型的Class对象
        System.out.println(constructor2);//Cat(String name，int age)
    }
}
