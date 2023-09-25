package demo03.bx_cha.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 服务端接收客户端发送的图片，并保持退出
 */
public class demo01SocketServer {
    public static void main(String[] args) throws IOException {

        String path1 = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\server\\a.png";
        String path2 = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\server\\music1.mp3";
        String path3 = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\server\\music2.mp3";

        //每次运行一个
        // server(path1);
        // server(path2);
        server(path3);


    }

    public static void server(String savePath) throws IOException {
        final int port = 9999;

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器已启动，等待客户端连接...");


        Socket clientSocket = serverSocket.accept();
        System.out.println("客户端已连接");

        String path = savePath;

        // 网络传输流
        InputStream inputStream = clientSocket.getInputStream();
        OutputStream outputStream = clientSocket.getOutputStream();

        // 转换流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));

        // 本地文件输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        byte[] buffer = new byte[1024];
        int length;

        while ((length = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, length);
        }
        System.out.println("文件保存成功\n");
        clientSocket.shutdownInput();
        // 向客户端发送保存成功信息
        bw.write("文件保存成功");
        bw.newLine();
        bw.flush();

        bos.close();
        clientSocket.close(); // 关闭客户端连接
    }

}
