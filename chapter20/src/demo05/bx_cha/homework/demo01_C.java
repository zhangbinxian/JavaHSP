package demo05.bx_cha.homework;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_C {
    public static void main(String[] args) throws IOException {
        final String ip = "192.168.56.1";
        final int port = 9999;
        Socket client = new Socket(ip, port);

        Scanner sc = new Scanner(System.in);

        InputStream inputStream = client.getInputStream();
        OutputStream outputStream = client.getOutputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream), true);

        String msg = null;
        System.out.println("请输入：");
        while (!("quit".equals(msg = sc.next()))) {

            writer.println(msg);
            System.out.println("server return:" + reader.readLine());
            System.out.println("请输入：");
        }
        System.out.println("client 已退出");



        writer.close();
    }
}
