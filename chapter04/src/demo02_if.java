import java.util.Scanner;

public class demo02_if {
    public static void main(String[] args) {
        // 四年一闰,百年不闰,四百年再闰

        /*
        遇到整百年时,必须是400的倍数才是闰年
        地球总是绕着太阳转动，转一圈就是一年。
        但是一年不是刚好365天，而是365天5时48分46秒，所以平年按365天计算
        每4年少了4个5小时48分46秒，等于23小时15分4秒，比一天的时间少一点，接近一天，所以每4年就加一天
        因此，每四年要规定一个闰年。

        虽然把23小时15分4秒算作一天只差44分56秒，差不了多少，但是如果过了400年，积少成多，相当于多算了3天，
        因此就应当在这400年中减少3天。这样就行成了“四年一闰、百年不闰、四百年又闰”。
        */

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year+"是闰年");
        }
        else {
            System.out.println(year+"不是闰年");
        }

    }
}
