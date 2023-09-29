package demo01.bx_cha.Class;

import demo01.bx_cha.Cat;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_class {
    public static void main(String[] args) throws Exception {
        //看看 Class 类图
        //1. Class 也是类，因此也继承 Object 类
        //Class
        //2. Class 类对象不是 new 出来的，而是系统创建的
        //(1) 传统 new 对象
        /**
         ClassLoader 类
         public Class<?> loadClass (String name) throws ClassNotFoundException {
         return loadClass(name, false);
         }
         */

        Cat cat = new Cat();
        //(2) 反射方式, 刚才老师没有 debug 到 ClassLoader 类的 loadClass, 原因是，我没有注销 Cat cat = new
        /**
         ClassLoader 类, 仍然是通过 ClassLoader 类加载 Cat 类的 Class 对象
         public Class<?> loadClass(String name) throws ClassNotFoundException {
         return loadClass(name, false);
         }
         */
        // 3. 对于某个类的 Class 类对象，在内存中只有一份，因为类只加载一次
        Class cls1 = Class.forName("demo01.bx_cha.Cat");
        Class cls2 = Class.forName("demo01.bx_cha.Cat");
        Class cls3 = Class.forName("demo01.bx_cha.Dog");

        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
    }
}
