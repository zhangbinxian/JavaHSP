package demo01.bx_cha.classLoad;

//此处体系静态类加载，可能程序运行当中不会使用到该类，没有此处，则报错

import demo01.bx_cha.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 */

/**
 * new Dog()是静态加载，所以必须编写Dog类，否则报错
 * Person类是动态加载，没有该类也不会报错，直到执行到此处时，动态加载时，才会报错(即进入case 2)
 */
public class demo01_classload {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出选择");
        String key = sc.next();

        switch (key) {
            case "1":
                Dog dog = new Dog();
                dog.cry();
                break;
            case "2":
                // 加载Person类，动态加载，真正用到的时候才加载
                Class<?> cls = Class.forName("demo01.bx_cha.classLoad.Person");
                Object o = cls.getDeclaredConstructor().newInstance();
                Method method = cls.getMethod("hi");
                method.invoke(o);
                break;
        }
    }
}

class Person {
    public void hi() {
        System.out.println("hi");
    }
}