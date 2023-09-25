package demo02.bx_cha.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01SocketTcpServer {
    public static void main(String[] args) throws IOException {

        final int serverPort = 9999;

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("server 9999端口监听，等待连接...");

        // ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        Socket accept = serverSocket.accept();
        System.out.println("server连接成功");

        // 没有客户端连接9999端口时，程序会 阻塞, 等待连接
        //   如果有客户端连接，则会返回Socket对象，程序继续

        InputStream inputStream = accept.getInputStream();

        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);

        String msg;
        while ((msg = br.readLine()) != null) {
            System.out.println("接收到客户端: " + msg);
        }
        serverSocket.close();
        accept.close();
        br.close();
    }
}
