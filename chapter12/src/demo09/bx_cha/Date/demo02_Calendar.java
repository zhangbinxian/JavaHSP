package demo09.bx_cha.Date;

import java.util.Calendar;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_Calendar {
    public static void main(String[] args) {
        //1. Calendar 是一个抽象类， 并且构造器是 private,不能new对象
        //2. 可以通过 getInstance() 来获取实例
        //3. 提供大量的方法和字段提供给程序员
        //4. Calendar 没有提供对应的格式化的类，因此需要程序员自己组合来输出(灵活)
        //5. 如果我们需要按照 24 小时进制来获取时间， Calendar.HOUR ==改成=> Calendar.HOUR_OF_DAY

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println("年：" + (calendar.get(Calendar.YEAR)));
        // 这里为什么要 + 1, 因为 Calendar 返回月时候，是按照 0 开始编号
        System.out.println("月：" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + calendar.get(Calendar.HOUR_OF_DAY));
        // System.out.println("小时：" + calendar.get(Calendar.HOUR));
        System.out.println("分钟：" + calendar.get(Calendar.MINUTE));
        System.out.println("秒：" + calendar.get(Calendar.SECOND));

        //Calender 没有专门的格式化方法，所以需要程序员自己来组合显示
        System.out.println(calendar.get(Calendar.YEAR) + "-"
                + (calendar.get(Calendar.MONTH) + 1) + "-"
                + calendar.get(Calendar.DAY_OF_MONTH) + " "
                + calendar.get(Calendar.HOUR_OF_DAY) + ":" +
                calendar.get(Calendar.MINUTE) + ":" +
                calendar.get(Calendar.SECOND));

    }
}
