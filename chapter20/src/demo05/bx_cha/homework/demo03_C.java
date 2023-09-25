package demo05.bx_cha.homework;

import java.io.*;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 从服务器下载歌曲到本地
 */
public class demo03_C {
    public static void main(String[] args) throws IOException {
        // 需要下载的文件地址
        String serverMusicPath = "chapter20/src/demo05/bx_cha/homework/download/server/music.mp3";
        String errServerMusicPath = "chapter20/src/demo05/bx_cha/homework/download/server/other.mp3";

        String clientSavePath = "chapter20/src/demo05/bx_cha/homework/download/client/music.mp3";

        // DownloadAndSave(serverMusicPath,clientSavePath);
        DownloadAndSave(errServerMusicPath,clientSavePath);
    }

    public static void DownloadAndSave(String serverMusicPath, String clientSavePath) throws IOException {
        final String ip = "192.168.56.1";
        final int serverPort = 8888;


        Socket client = new Socket(ip, serverPort);
        System.out.println("连接成功");

        // 网络流
        InputStream inputStream = client.getInputStream();
        OutputStream outputStream = client.getOutputStream();

        // 包装网络流
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream), true);

        writer.println(serverMusicPath);
        System.out.println("请求以发送");
        client.shutdownOutput();

        // 本地流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(clientSavePath));

        byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, length);
        }
        System.out.println("download over");

        bos.close();
        writer.close();
        client.close();

    }
}
