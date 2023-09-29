package demo01.bx_cha.qqclient.service;

import demo01.bx_cha.qqcommon.Message;
import demo01.bx_cha.qqcommon.MessageType;
import demo01.bx_cha.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 该类完成用户登录验证和用户注册
 */
@SuppressWarnings({"all"})
public class UserClientService {

    // 其他地方也可能使用到User信息，定义成为熟悉
    private User user = new User();
    private Socket socket = null;
    private String ServerIp = "192.168.56.1";
    private int ServerPort = 9999;

    public boolean checkUser(String userId, String password) {
        boolean b = false;
        // 创建User对象
        user.setUserId(userId);
        user.setPassword(password);

        // 连接到服务器，发送user对象
        try {
            socket = new Socket(ServerIp, ServerPort);
            // 得到ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            // 发送user对象
            oos.writeObject(user);

            // 读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message msg = (Message) ois.readObject();

            if (MessageType.MESSAGE_LOGIN_SUCCEED.equals(msg.getMsgType())) {
                //登录成功

                //创建一个和服务器端通信的线程
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                // 启动线程
                clientConnectServerThread.start();
                // 将线程加入到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);

                b = true;


            } else {
                //如果登录失败, 我们就不能启动和服务器通信的线程, 关闭socket
                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    //向服务器端请求在线用户列表
    public void onlineFriendList() {

        //发送一个Message , 类型MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(user.getUserId());

        //发送给服务器

        try {
            //从管理线程的集合中，通过userId, 得到这个线程对象
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getThread(user.getUserId());
            //通过这个线程得到关联的socket
            Socket socket = clientConnectServerThread.getSocket();
            //得到当前线程的Socket 对应的 ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message); //发送一个Message对象，向服务端要求在线用户列表
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //编写方法，退出客户端，并给服务端发送一个退出系统的message对象
    public void logout() {
        Message message = new Message();
        message.setMsgType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(user.getUserId());//一定要指定我是哪个客户端id

        //发送message
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getThread(user.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(user.getUserId() + " 退出系统 ");
            System.exit(0);//结束进程
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
