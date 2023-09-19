package demo09.bx_cha.Properties;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 *
 * 使用 Properties 类来读取 mysql.properties 文件
 */
public class demo02_properties02 {
    public static void main(String[] args) throws IOException {

    }

    @Test
    public void readProperties() throws IOException {
        //读取mysql.properties 文件，并得到ip, user 和 pwd
        String path = "./src/demo09/bx_cha/Properties/resource/mysql.properties";

        // 创建对象
        Properties properties = new Properties();

        // 加载指定配置文件
        properties.load(new FileReader(path));

        // 把k-v显示到控制台
        properties.list(System.out);
        System.out.println();

        // 根据key 获取对应值
        String ip = properties.getProperty("ip");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("ip=" + ip);
        System.out.println("username=" + username);
        System.out.println("password=" + password);
    }
}
