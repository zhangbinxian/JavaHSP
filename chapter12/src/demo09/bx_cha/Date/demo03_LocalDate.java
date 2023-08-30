package demo09.bx_cha.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo03_LocalDate {
    public static void main(String[] args) {

        //1. 使用 now() 返回表示当前日期时间的 对象
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());
        System.out.println(localDate.getYear() + "年" + localDate.getMonthValue() + "月" + localDate.getDayOfMonth() + "日");

        System.out.println("年=" + localDateTime.getYear());
        System.out.println("月=" + localDateTime.getMonth());
        System.out.println("月=" + localDateTime.getMonthValue());
        System.out.println("日=" + localDateTime.getDayOfMonth());
        System.out.println("时=" + localDateTime.getHour());
        System.out.println("分=" + localDateTime.getMinute());
        System.out.println("秒=" + localDateTime.getSecond());

        //2. 使用 DateTimeFormatter 对象来进行格式化
        // 创建 DateTimeFormatter 对象

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
        String format = dtf.format(localDateTime);
        System.out.println(format);

        //提供 plus 和 minus 方法可以对当前时间进行加或者减
        //看看 890 天后，是什么时候 把 年月日-时分秒
        LocalDateTime ldt_After_890 = localDateTime.plusDays(890);
        System.out.println("890 天后=" + dtf.format(ldt_After_890));
        //看看在 3456 分钟前是什么时候，把 年月日-时分秒输出
        LocalDateTime ldt_Before_3456 = localDateTime.minusMinutes(3456);
        System.out.println("3456 分钟前 日期=" + dtf.format(ldt_Before_3456));


    }
}
