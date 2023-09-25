package demo03.bx_cha.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * upload v2
 */
public class demo02SocketServer {
    public static void main(String[] args) throws Exception {
        String path = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\server\\aa.png";
        save(path);
    }

    public static void save(String path) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等待连接...");
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");

        // socket流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        BufferedInputStream bis = new BufferedInputStream(inputStream);

        byte[] bytes = StreamUtils.streamToByteArray(bis);

        // 本地输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        bos.write(bytes);
        System.out.println("save over");

        socket.shutdownInput();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("已保存");
        bw.newLine();
        bw.flush();

        socket.shutdownOutput();

        bw.close();
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();



    }
}
