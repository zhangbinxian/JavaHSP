package demo02.bx_cha.CustomGeneric;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/**
 * 泛型接口使用的说明
 * 1. 接口中，静态成员也不能使用泛型
 * 2. 泛型接口的类型, 在继承接口或者实现接口时确定
 * 3. 没有指定类型，默认为 Object
 */

/**
 * interface IUsb<U, R>
 * <p>
 * 1. 在继承接口中,指定泛型接口的类型
 * interface IA extends IUsb<String,Double>
 * <p>
 * 2. 在实现接口时,IA在继承IUsb接口时,已经指定了泛型类型
 * class AA implements IA
 * <p>
 * 3. 在实现接口时,直接指定泛型接口的类型
 * class BB implements IUsb<Integer,Double>
 * <p>
 * 4. 没有指定类型，默认为 Object
 * class CC implements IUsb
 */
interface IUsb<U, R> {

    // 接口中的属性，只能是final，而且是public static final 修饰符
    int i = 10;
    // U name="zbx";// 静态不能使用泛型

    // 普通方法中,可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    // 在jdk8中,可以在接口中,使用默认方法,也可以使用泛型
    default R method(U u) {
        return null;
    }
}

// 在继承接口中,指定泛型接口的类型
interface IA extends IUsb<String, Double> {

}

// 在实现接口时,IA在继承IUsb接口时,已经指定了泛型类型
// <U, R> ---> <String,Double>
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

// 在实现接口时,直接指定泛型接口的类型
// <U, R> ---> <Integer,Double>
class BB implements IUsb<Integer, Double> {

    @Override
    public Double get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, Integer u1, Integer u2) {

    }
}

// 没有指定类型，默认为 Object
// 建议写成 class CC implements IUsb<Object,Object>
class CC implements IUsb {

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}