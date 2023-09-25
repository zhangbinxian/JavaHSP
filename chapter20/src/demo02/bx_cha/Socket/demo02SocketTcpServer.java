package demo02.bx_cha.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02SocketTcpServer {
    public static void main(String[] args) throws IOException {

        final int port = 9999;

        ServerSocket serverSocket = new ServerSocket(port);
        Socket server = serverSocket.accept();

        InputStream inputStream = server.getInputStream();
        OutputStream outputStream = server.getOutputStream();


        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);

        String msg = br.readLine();

        System.out.println("服务器接收到：" + msg);
        if ("hi server".equals(msg)) {
            /**
             * 发送的时候，需要加换行符”\n“
             * 并且需要flush()
             */
            bw.write("hi client\n");
            bw.flush();
        } else {
            System.out.println("other msg");
        }
        serverSocket.close();
        server.close();
    }
}
