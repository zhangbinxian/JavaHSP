package demo04.bx_cha.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * udp发送端
 */
public class demo01_UdpClient {
    public static void main(String[] args) throws IOException {

        // 创建UDP客户端Socket，准备在8888端口 接收数据
        DatagramSocket client = new DatagramSocket(8888);

        // 服务器地址和端口
        String ip = "192.168.56.1";
        InetAddress serverAddress = InetAddress.getByName(ip);
        int serverPort = 9999;

        String message = "你好 服务端";

        // 将消息转换为字节数组
        byte[] sendData = message.getBytes();

        // 创建发送数据的DatagramPacket
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

        // 发送数据包
        client.send(sendPacket);

        /**
         * 接收数据
         */
        // receiveData接收数据
        byte[] receiveData = new byte[1024];

        // 创建接收数据的DatagramPacket
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        // 接收数据
        client.receive(receivePacket);

        // 从DatagramPacket中获取数据并进行处理
        String receivedMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("客户端接收到服务器回传的消息: " + receivedMsg);
        // 关闭客户端Socket
        client.close();

    }
}
