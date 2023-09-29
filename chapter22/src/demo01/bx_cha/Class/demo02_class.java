package demo01.bx_cha.Class;

import demo01.bx_cha.Car;

import java.lang.reflect.Field;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_class {
    public static void main(String[] args) throws Exception {

        String classAllPath = "demo01.bx_cha.Car";
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);

        System.out.println(cls);//哪个类的Class对象，demo01.bx_cha.Cat

        System.out.println(cls.getClass());//运行类型，java.lang.Class

        System.out.println(cls.getPackage().getName());//包名

        System.out.println(cls.getName());//全类名

        Car car = (Car) cls.getDeclaredConstructor().newInstance();//获得一个实例(无参)
        System.out.println(car);//car.toString()

        //获得属性 属性.get(obj)
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));

        // 赋值、改值
        brand.set(car, "大G");
        System.out.println(brand.get(car));

        System.out.println("==============getFields() 获得所有属性==================");
        Field[] clsFields = cls.getFields();
        for (Field field : clsFields) {
            System.out.println(field.getName() + " " + field.get(car));//属性.getName()  属性.get(obj)
        }
    }
}
