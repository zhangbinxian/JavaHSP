package demo01.bx_cha.enum_;

/**
 * @author bx_cha
 * @version 1.0
 */

// enum关键字实现枚举类
public class demo02_Enum {
    public static void main(String[] args) {

        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
    }
}

/**
 * 1. 使用enum关键字替代class
 * 2. 使用常量名(实参列表), SPRING("春天", "温暖");
 * 3. 如果有多个常量(对象),中间使用","隔开
 * 4. 如果使用enum类，定义常量对象，要写在前面
 */
enum Season2 {


    SPRING("春天", "温暖"),

    SUMMER("夏天", "炎热"),

    AUTUMN("秋天", "凉爽"),

    WINTER("冬天", "寒冷");
    // 无参构造器的枚举对象可以不写实参列表和括号
    // Other, what;

    private String name;
    private String desc;


    // 无参构造器
    Season2() {
    }

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}