package com.bx_cha.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 使用反射
 */
@SuppressWarnings({"all"})
public class jdbcConnect {
    public static void main(String[] args) {

    }

    @Test
    public void fun1() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db2";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "bx_cha");
        Connection connect = driver.connect(url, properties);

        System.out.println("func2" + connect);
        connect.close();
    }

    @Test
    public void fun2() throws Exception {
        //使用反射加载Driver
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");

        // Object instance = aClass.newInstance();
        Driver driver = (Driver) aClass.newInstance();//实例化对象

        String url = "jdbc:mysql://localhost:3306/db2";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "bx_cha");

        Connection connect = driver.connect(url, properties);
        System.out.println("func2" + connect);

        connect.close();
    }

    @Test
    //方式3 使用DriverManager 替代 driver 进行统一管理
    public void fun3() throws Exception {

        //使用反射加载Driver
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        //创建url 和 user 和 password
        String url = "jdbc:mysql://localhost:3306/db2";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "bx_cha");

        DriverManager.registerDriver(driver);//注册Driver驱动

        Connection connection = DriverManager.getConnection(url, properties);
        System.out.println("第三种方式=" + connection);
        connection.close();
    }

    //方式4: 使用Class.forName 自动完成注册驱动，简化代码
    //这种方式获取连接是使用的最多，推荐使用
    @Test
    public void fun4() throws ClassNotFoundException, SQLException {
        //使用反射加载了 Driver类
        //在加载 Driver类时，完成注册
        /*
            源码: 1. 静态代码块，在类加载时，会执行一次.
            2. DriverManager.registerDriver(new Driver());
            3. 因此注册driver的工作已经完成
            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
         */
        Class.forName("com.mysql.jdbc.Driver");

        //创建url 和 user 和 password
        String url = "jdbc:mysql://localhost:3306/db2";
        String user = "root";
        String password = "bx_cha";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("第四种方式=" + connection);
        connection.close();
    }
    //方式5 , 在方式4的基础上改进，增加配置文件，让连接mysql更加灵活
    @Test
    public void fun5() throws IOException, ClassNotFoundException, SQLException {

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        //获取相关的值
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);//建议写上

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("方式5 " + connection);
        connection.close();
    }
}
