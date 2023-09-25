package demo05.bx_cha.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 客户端发起下载请求，判断是否有此歌曲，有：发送，没有：发送默认歌曲
 */
public class demo03_S {
    public static void main(String[] args) throws IOException {

        download();

    }

    public static void download() throws IOException {
        final int serverPort = 8888;
        String defaultPath = "chapter20/src/demo05/bx_cha/homework/download/server/default.mp3";

        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("等待连接");
        Socket server = serverSocket.accept();

        // 网络流
        InputStream inputStream = server.getInputStream();
        OutputStream outputStream = server.getOutputStream();

        // 读取网络传输过来的文件地址
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String downloadFilePath = reader.readLine();
        server.shutdownInput();

        System.out.println("请求路径" + downloadFilePath);

        // 读取服务器的文件
        BufferedInputStream bis = null;

        // 判断文件是否存在
        File file = new File(downloadFilePath);

        if (file.exists()) {
            // 读取传输文件
            byte[] buffer = new byte[1024];
            int length;
            System.out.println("开始下载...");
            bis = new BufferedInputStream(new FileInputStream(downloadFilePath));

            while ((length = bis.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("提供了music");
        } else {
            byte[] buffer = new byte[1024];
            int length;
            System.out.println("开始下载默认文件...");

            bis = new BufferedInputStream(new FileInputStream(defaultPath));
            while ((length = bis.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("提供了默认music");
        }

        bis.close();
        reader.close();
        server.close();

    }
}
