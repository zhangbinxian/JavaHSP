package demo05.bx_cha.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_S {
    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("服务器已开启");
            while (true) {
                System.out.println("等待连接...");
                Socket server = serverSocket.accept();

                InputStream inputStream = server.getInputStream();
                OutputStream outputStream = server.getOutputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream), true);//自动刷新

                // String msg = reader.readLine();
                String msg;
                while ((msg = reader.readLine()) != null) {
                    System.out.println("server get:" + msg);
                    if ("name".equals(msg)) {
                        writer.println("我是zbx");
                    } else if ("hobby".equals(msg)) {
                        writer.println("我爱java");
                    } else {
                        writer.println("what?");
                    }
                }
                System.out.println("用户已退出\n");


                writer.close();
                reader.close();
                server.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
