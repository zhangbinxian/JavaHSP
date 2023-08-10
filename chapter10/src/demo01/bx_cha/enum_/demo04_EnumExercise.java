package demo01.bx_cha.enum_;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_EnumExercise {
    public static void main(String[] args) {
        Weekend[] weekends = Weekend.values();
        for (Weekend weekend : weekends) {
            System.out.println(weekend.toString());
        }
    }
}

enum Weekend {

    MONDAY("星期一"),
    TUERSDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String name;

    private Weekend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
