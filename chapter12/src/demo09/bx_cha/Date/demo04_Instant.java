package demo09.bx_cha.Date;

import java.time.Instant;
import java.util.Date;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo04_Instant {
    public static void main(String[] args) {

        //1.通过 静态方法 now() 获取表示当前时间戳的对象
        Instant instant = Instant.now();
        System.out.println(instant);

        //2. 通过 from 可以把 Instant 转成 Date
        Date date=Date.from(instant);
        System.out.println(date);

        //3. 通过 date 的 toInstant() 可以把 date 转成 Instant 对象
        Instant instant1 = date.toInstant();
        System.out.println(instant1);


    }
}
