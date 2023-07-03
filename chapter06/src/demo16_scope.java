// 属性和局部变量可以重名，访问时，遵循就近原则
public class demo16_scope {
    public static void main(String[] args) {
        demo16_person person1 = new demo16_person();
        person1.say();
    }
}

class demo16_person {
    String name = "zbx";

    public void say() {
        String name = "wxy";
        // 就近原则，调用say(),则输出wxy，如果注销name=”wxy“,则输出zbx
        System.out.println("say() name= " + name);
    }

    public void hi() {
        String address = "wuhan";

        // 错误，重复定义变量address
        // String address="beijing";

        String name = "zzz";

    }
}