package demo05.bx_cha.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_S {
    public static void main(String[] args) throws IOException {
        // 自己的端口，要发送客户端的ip和端口
        final String ip = "192.168.56.1";
        final int clientPort = 9999;
        final int serverPort = 8888;
        InetAddress inetAddress = InetAddress.getByName(ip);

        // 创建服务器
        DatagramSocket server = new DatagramSocket(serverPort);

        // 发送，接收的数组
        byte[] senderData = new byte[1024];
        byte[] receiveData = new byte[1024];

        // 服务器接收包，并解析
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        server.receive(receivePacket);
        System.out.println("接收成功");

        String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("服务器接收到：" + msg);

        // 服务器，包装发送包，反馈客户端
        DatagramPacket senderPacket = null;
        if ("四大名著？".equals(msg)) {
            senderData = "红楼梦，西游记，水浒传，三国演义".getBytes();
            senderPacket = new DatagramPacket(senderData, senderData.length, inetAddress, clientPort);
        } else {
            senderData = "what?".getBytes();
            senderPacket = new DatagramPacket(senderData, senderData.length, inetAddress, clientPort);
        }
        server.send(senderPacket);
        System.out.println("回复成功");

        server.close();
        System.out.println("服务器退出");
    }
}
