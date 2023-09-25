package demo03.bx_cha.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * upload v2
 */
public class demo02SocketClient {
    public static void main(String[] args) throws Exception {
        String path = "chapter20\\src\\demo03\\bx_cha\\upload\\upload\\client\\aa.png";

        upload(path);
    }

    public static void upload(String path) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println("连接成功");

        // socket 流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        // 本地文件流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

        byte[] bytes = StreamUtils.streamToByteArray(bis);

        // 传输数据
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        bos.write(bytes);
        System.out.println("upload over");
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记


        // BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        // String msg=null;
        // while ((msg=br.readLine())!=null){
        //     System.out.println("收到服务器回复："+msg);
        // }
        // br.close();

        String string = StreamUtils.streamToString(inputStream);
        System.out.println("收到服务器回复："+string);


        bos.close();
        socket.close();

    }
}
