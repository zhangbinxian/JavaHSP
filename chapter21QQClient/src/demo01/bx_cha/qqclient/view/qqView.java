package demo01.bx_cha.qqclient.view;

import demo01.bx_cha.qqUtils.Utils;
import demo01.bx_cha.qqclient.service.UserClientService;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 客户端界面
 */
public class qqView {
    public static void main(String[] args) {
        new qqView().mainMenu();
        System.out.println("客户端退出系统...");
    }

    private boolean loop = true; //控制是否显示菜单
    private String key = ""; // 接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//对象是用于登录服务/注册用户


    private void mainMenu()  {
        while (loop) {
            System.out.println("====================欢迎使用===================");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.print("请输入你的选择: ");
            key = Utils.readString(1);

            switch (key) {
                case "1":
                    System.out.printf("请输入用户名：");
                    String userId = Utils.readString(50);
                    System.out.printf("请输入密码：");
                    String password = Utils.readString(50);


                    if (userClientService.checkUser(userId,password)) {
                        System.out.println("============欢迎" + userId + "=============");
                        while (loop) {
                            System.out.println("============欢迎" + userId + "进入二级菜单=============");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出菜单");
                            System.out.println("请输入选择：");
                            key = Utils.readString(1);
                            switch (key) {
                                case "1":
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.println("私聊消息");
                                     break;
                                case "4":
                                    System.out.println("发送文件");
                                    break;
                                case "9":
                                    //调用方法，给服务器发送一个退出系统的message
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }
                        }
                    } else {//登录失败
                        System.out.println("============登录失败============");
                    }
                    break;

                case "9":
                    loop = false;
                    break;
            }
        }
    }
}
