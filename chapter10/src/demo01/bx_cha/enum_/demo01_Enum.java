package demo01.bx_cha.enum_;

/**
 * @author bx_cha
 * @version 1.0
 */

// 自定义枚举类
public class demo01_Enum {
    public static void main(String[] args) {

        System.out.println(Season.SPRING);
    }
}

/**
 * 1. 构造器私有化，防止直接new
 * 2. 去掉setXX()，防止属性被修改
 * 3. 在Serson内部，直接创建固定的对象
 * 4. 加入final修饰符
 */
class Season {
    private String name;
    private String desc;

    // 定义了四个对象
    public final static Season SPRING = new Season("春天", "温暖");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    private Season(String name, String desc) {
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