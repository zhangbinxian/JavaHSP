package demo01.bx_cha.reflection;

import demo01.bx_cha.Cat;

import java.lang.reflect.Method;

/**
 * @author bx_cha
 * @version 1.0
 */
@SuppressWarnings("all")
public class demo02_Reflection {
    public static void main(String[] args) throws Exception {

        //Field
        //Method
        //Constructor

        m1();//传统
        m2();//反射
        m3();//反射优化


    }

    //传统方法来调用 hi
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1() 耗时=" + (end - start));
    }

    //反射机制调用方法 hi
    public static void m2() throws Exception {
        Class cls = Class.forName("demo01.bx_cha.Cat");
        // Object o = cls.newInstance();//已经被弃用
        Object o = cls.getDeclaredConstructor().newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("m2() 耗时=" + (end - start));

    }

    //反射调用优化 + 关闭访问检查
    public static void m3() throws Exception {
        Class cls = Class.forName("demo01.bx_cha.Cat");
        // Object o = cls.newInstance();//已经被弃用
        Object o = cls.getDeclaredConstructor().newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("m3() 耗时=" + (end - start));
    }
}
