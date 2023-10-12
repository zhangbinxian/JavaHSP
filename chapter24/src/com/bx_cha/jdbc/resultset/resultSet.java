package com.bx_cha.jdbc.resultset;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 * resultSet的使用
 */
@SuppressWarnings({"all"})
public class resultSet {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();

        properties.load(new FileInputStream("chapter24\\src\\mysql.properties"));

        //获取相关的值
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        // 加载驱动
        Class.forName(driver);

        // 建立连接
        Connection connection = DriverManager.getConnection(url, user, password);
        // 得到statement
        Statement statement = connection.createStatement();
        String sql="select id,name,sex,borndate from table1_actor";

        ResultSet resultSet = statement.executeQuery(sql);

        // 让光标向后移动，如果没有更多行，则返回false
        while (resultSet.next()){
            /**
             *       id	int(11)	PRI	auto_increment
             *       name	varchar(32)
             *       sex	char(1)	NO
             *       borndate	datetime
             *       phone	varchar(12)
             */

            int id=resultSet.getInt(1);//获取该行的第1列
            String name=resultSet.getString(2);//获取该行的第2列
            String sex=resultSet.getString(3);//获取该行的第3列
            Date borndata= resultSet.getDate(4);//获取该行的第4列

            System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndata);

        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}
