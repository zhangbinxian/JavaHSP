package demo09.bx_cha.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_Date {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println("当前系统时间" + date);

        //1. 创建 SimpleDateFormat 对象，可以指定相应的格式
        //2. 这里的格式使用的字母是规定好，不能乱写
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        System.out.println(simpleDateFormat.format(date));


        Date date2 = new Date(923451267); //通过指定毫秒数得到时间
        System.out.println("d2=" + date2); //获取某个时间对应的毫秒数


        //1. 可以把一个格式化的 String 转成对应的 Date
        //2. 得到 Date 仍然在输出时，还是按照国外的形式，如果希望指定格式输出，需要转换
        //3. 在把 String -> Date ， 使用的 sdf 格式需要和你给的 String 的格式一样，否则会抛出转换异常
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = simpleDateFormat.parse(s);
        System.out.println("parse=" + parse);
        System.out.println("parse=" + simpleDateFormat.format(parse));
    }
}
