package demo01.bx_cha.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo05_GenericDetail {
    public static void main(String[] args) {

        // 1. 给泛型指向的数据类型是，引用数据类型，不能是基本数据类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<int> list1 = new ArrayList<int>();//错误，类型参数不能是基本类型

        // 2. 给泛型指定具体的类型后，可以传入该类型，或者其子类的类型型
        Pig<A> aPig1 = new Pig<A>(new A());
        aPig1.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();

        //3. 泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        //在实际开发中，我们往往简写 左边写，右边不写
        //编译器会进行类型推断, 推荐使用下面写法
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();


        //4. 如果是这样写 泛型默认是 Object
        ArrayList arrayList = new ArrayList();
        //等价 ArrayList<Object> arrayList = new ArrayList<Object>();


    }
}

class A {
}

class B extends A {
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass()); //运行类型
    }
}