package demo02.bx_cha.Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 客户端，发送 "hello, server" 给服务端
 */
public class demo01SocketTcpClient {
    public static void main(String[] args) throws IOException {

        final String serverAddress = "192.168.56.1";
        final int serverPort = 9999;

        Scanner scanner = new Scanner(System.in);

        // 连接本机的 9999端口, 如果连接成功，返回Socket对象
        // Socket client = new Socket(InetAddress.getLocalHost(),serverPort);//直接写本地地址
        Socket client = new Socket(serverAddress, serverPort);
        System.out.println("client连接成功");

        OutputStream outputStream = client.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(osw);


        String msg;
        System.out.println("请输出：");
        while (!"quit".equals(msg = scanner.next())) {
            /**
             * 发送的时候，需要加换行符”\n“,
             * 或者bw.newLine(),效果也是换行
             *
             * 并且需要flush()
             */
            bw.write(msg + "\n");

            bw.flush();
            System.out.println("客户端发送" + msg);
        }

        bw.close();
        client.close();
        System.out.println("client 退出");
    }
}
