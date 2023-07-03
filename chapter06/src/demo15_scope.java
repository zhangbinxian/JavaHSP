// - 在java当中，主要的变量就是属性(成员变量)和局部变量
// - 局部变量```一般```是指成员方法当中定义的变量
// - java作用域的分类
// 1. 全局变量，也就是属性，作用域为整个类体
// 2. 局部变量，除了属性之外的其他变量，作用域为定义它的代码块中
// - 全局变量可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，没有默认值

public class demo15_scope {
    public static void main(String[] args) {

    }
}

class Scope1 {
    // 全局变量，也就是属性，作用域为整个类体
    // age是全局变量
    int age = 20;

    public void func1() {
        // 局部变量一般是指在成员方法当中定义的变量.
        // n和name是局部变量
        // n和name的作用域在func1方法当中
        int n = 10;
        String name = "wxy";
    }

    public void func2() {
        // 可以直接使用age，因为age是全局变量
        System.out.println(age);
        // 不能在func2当中只有name,因为name是在func1当中的局部变量
        // System.out.println(name);
    }
}