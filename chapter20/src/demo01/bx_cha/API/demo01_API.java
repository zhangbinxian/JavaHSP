package demo01.bx_cha.API;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class demo01_API {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取本机的InetAddress 对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//bx-cha/192.168.56.1

        //2. 根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("bx-cha");
        System.out.println("host1=" + host1);//bx-cha/192.168.56.1

        //3. 根据域名返回 InetAddress对象, 比如 www.baidu.com 对应
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" + host2);//www.baidu.com/14.119.104.254

        //4. 通过 InetAddress 对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2 对应的ip = " + hostAddress);

        //5. 通过 InetAddress 对象，获取对应的主机名/或者的域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名=" + hostName); // www.baidu.com


    }
}
