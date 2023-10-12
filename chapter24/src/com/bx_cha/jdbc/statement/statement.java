package com.bx_cha.jdbc.statement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 * sql注入问题
 */
@SuppressWarnings({"all"})
public class statement {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        Properties properties = new Properties();

        properties.load(new FileInputStream("chapter24\\src\\mysql.properties"));


        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");


        Class.forName(driver);


        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        String sql="select id,name,sex,borndate from table1_actor";

        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next()){


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
