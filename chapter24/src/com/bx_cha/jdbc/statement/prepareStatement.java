package com.bx_cha.jdbc.statement;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class prepareStatement {
    public static void main(String[] args) throws Exception {
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

        // ? 相当于占位符
        String sql = "select id,name,sex,borndate from table1_actor where id=? or name=?";
        // 得到statement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 给 ? 赋值
        preparedStatement.setInt(1, 3);
        preparedStatement.setString(2, "bx_cha");

        // 这里不要写sql  preparedStatement.executeQuery(sql语句)，上面prepareStatement(sql);处理了sql
        ResultSet resultSet = preparedStatement.executeQuery();

        // 让光标向后移动，如果没有更多行，则返回false
        while (resultSet.next()) {

            int id = resultSet.getInt(1);//获取该行的第1列
            String name = resultSet.getString(2);//获取该行的第2列
            String sex = resultSet.getString(3);//获取该行的第3列
            Date borndata = resultSet.getDate(4);//获取该行的第4列

            System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndata);

        }
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }

}
