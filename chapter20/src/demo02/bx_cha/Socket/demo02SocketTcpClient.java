package demo02.bx_cha.Socket;

import java.io.*;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo02SocketTcpClient {
    public static void main(String[] args) throws IOException {

        final String ip = "192.168.56.1";
        final int port = 9999;

        Socket socket = new Socket(ip, port);

        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        // 输出流
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);

        // 输出流

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(outputStreamWriter);


        String msg = "hi server";

        /**
         * 发送的时候，需要加换行符”\n“
         * 并且需要flush()
         */
        bw.write(msg + "\n");
        bw.flush();
        System.out.println("客户端发送成功");

        System.out.println("客户端收到：" + br.readLine());


        socket.close();
    }
}
