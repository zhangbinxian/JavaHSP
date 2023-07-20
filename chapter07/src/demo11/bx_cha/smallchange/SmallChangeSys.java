package demo11.bx_cha.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        boolean loop = true;
        double money = 0;
        // 余额
        double balance = 0;

        // 日期
        Date date = null;
        // SimpleDateFormat 用来格式化日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        ;


        Scanner scanner = new Scanner(System.in);

        String choose = "";

        String details = "----------------零钱通明细--------------\n";
        String note = "";

        do {
            System.out.println("==================零钱通================");
            System.out.println("\t\t\t\t1 明细");
            System.out.println("\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t3 消费");
            System.out.println("\t\t\t\t4 退出");
            System.out.println("==================零钱通================");

            System.out.println("请选择(1-4):");
            choose = scanner.next();

            switch (choose) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2:收益入账");
                    money = scanner.nextDouble();

                    if (money <= 0) {
                        System.out.println("收益应该大于等于0");
                        break;
                    }
                    date = new Date();

                    balance += money;
                    // 将信息拼接到details当中
                    details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;

                    break;
                case "3":
                    System.out.println("3:消费金额");
                    money = scanner.nextDouble();

                    // 判断输入不合理的情况，消费<0, 消费金额>余额
                    if (money <= 0 || money >= balance) {
                        System.out.println("消费金额应该大于等于0,消费金额不能大于余额");
                        break;
                    }
                    System.out.println("消费说明:");

                    note = scanner.next();
                    date = new Date();
                    balance -= money;
                    // 将信息拼接到details当中
                    details += "\n" + note + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
                    break;
                case "4":
                    String quit = "";
                    System.out.println("4:退出");
                    while (true) {
                        System.out.println("确认退出码？y/n");
                        quit = scanner.next();
                        if ("y".equals(quit) || "n".equals(quit)) {
                            break;
                        }
                    }
                    if ("y".equals(quit)) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误");
            }

        } while (loop);

    }

    public void mingxi1() {

    }
}
