package demo05.bx_cha.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02_C {
    public static void main(String[] args) throws IOException {
        final String ip = "192.168.56.1";
        final int clientPort = 9999;
        final int serverPort = 8888;

        Scanner sc = new Scanner(System.in);

        InetAddress inetAddress = InetAddress.getByName(ip);

        DatagramSocket client = new DatagramSocket(clientPort);

        // 发送接收包大小
        byte[] senderData = new byte[1024];
        byte[] receiveData = new byte[1024];

        // 发送的数据.getBytes()
        System.out.println("请选择要询问的问题：");
        System.out.println("1:四大名著？");
        System.out.println("2:奇怪的问题？");

        int choice = sc.nextInt();
        if (choice == 1) {
            senderData = "四大名著？".getBytes();
        } else if (choice == 2) {
            senderData = "奇怪的问题".getBytes();
        }

        // 封装发送包,并发送
        DatagramPacket senderPacket = new DatagramPacket(senderData, senderData.length, inetAddress, serverPort);
        client.send(senderPacket);
        System.out.println("发送成功");

        // 封装接收包，并接收
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        client.receive(receivePacket);
        System.out.println("接收成功");
        // 解析包内容
        String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("服务器回复：" + msg);

        client.close();
        System.out.println("客户端退出");
    }
}
