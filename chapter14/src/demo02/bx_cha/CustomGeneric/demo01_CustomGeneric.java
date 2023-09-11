package demo02.bx_cha.CustomGeneric;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_CustomGeneric {
    public static void main(String[] args) {

    }
}

//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2, T, R, M 泛型的标识符, 一般是单个大写字母
//3. 泛型标识符可以有多个.
//4. 普通成员可以使用泛型 (属性、方法)
//5. 使用泛型的数组，不能初始化
//6. 静态方法中不能使用类的泛型
class Tiger<T, R, M> {
    String name;

    //属性使用到泛型
    T t;
    R r;
    M m;

    // 构造器使用泛型
    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }

    /**
     * 因为数组在new，不能确定T的类型，就无法在内存当中开辟空间
     */
    // T[] ts=new T[8];// 错误


    /**
     * 因为静态和类相关,在类加载时,对象好没有创建
     * 所以,如果静态方法和属性使用了泛型,JVM就无法完成初始化
     */
    // static R r2;
    // public static void f(M m2){
    //
    // }
    // 方法使用泛型
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //返回类型可以使用泛型.
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
