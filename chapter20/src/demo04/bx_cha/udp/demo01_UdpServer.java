package demo04.bx_cha.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * udp接收端
 */
public class demo01_UdpServer {
    public static void main(String[] args) throws IOException {
        // 创建UDP服务器Socket，指定端口
        DatagramSocket server = new DatagramSocket(9999);

        byte[] receiveData = new byte[1024];

        // 创建接收数据的DatagramPacket
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        // 接收数据
        // 当有数据包发送到 本机的9999端口时，就会接收到数据
        // 如果没有数据包发送到 本机的9999端口, 就会阻塞等待.
        server.receive(receivePacket);

        // 从DatagramPacket中获取数据并进行处理
        String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("服务器接收到客户端发送的消息: " + receivedMessage);
        /**
         * 发送数据
         */

        // 客户端IP地址
        String ip = "192.168.56.1";
        InetAddress clientAddress = InetAddress.getByName(ip);
        int clientPort = 8888;

        // 将消息转换为字节数组
        byte[] sendData = "你好 客户端".getBytes();
        // 创建发送数据的DatagramPacket
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
        // 发送数据包
        server.send(sendPacket);

        server.close();


    }
}