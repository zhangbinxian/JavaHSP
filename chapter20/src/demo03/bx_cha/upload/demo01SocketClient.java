package demo03.bx_cha.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 客户端发送图片到服务端
 */
public class demo01SocketClient {
    public static void main(String[] args) throws IOException {
        String path1 = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\client\\a.png";
        String path2 = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\client\\music1.mp3";
        String path3 = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\client\\music2.mp3";


        //每次运行一个
        // client(path1);
        // client(path2);
        client(path3);


    }

    public static void client(String filePath) throws IOException {
        final String serverAddress = "192.168.56.1";
        final int serverPort = 9999;

        String path = filePath;

        Socket socket = new Socket(InetAddress.getLocalHost(), serverPort);

        System.out.println("连接成功");
        // 网络传输流
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        // 转换流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        // 本地文件输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

        byte[] buffer = new byte[1024];
        int length;

        while ((length = bis.read(buffer)) != -1) {
            outputStream.write(buffer, 0, length);
        }
        System.out.println("文件传输完成\n");
        socket.shutdownOutput();

        // 接收服务器的保存成功消息
        String serverResponse = br.readLine();
        System.out.println("服务器消息：" + serverResponse);

        socket.close();
        bis.close();
    }
}
