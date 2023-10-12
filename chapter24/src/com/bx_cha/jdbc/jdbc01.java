package com.bx_cha.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author bx_cha
 * @version 1.0
 */
public class jdbc01 {

    public static void main(String[] args) throws SQLException {
        // 加载驱动
        Driver driver = new Driver();

        // 连接数据库
        String url = "jdbc:mysql://localhost:3306/db2";

        Properties properties = new Properties();

        properties.setProperty("user", "root");
        properties.setProperty("password", "bx_cha");

        Connection connect = driver.connect(url, properties);

        // 执行sql
        String sql = "insert into table1_actor(id, name, sex, borndate, phone)" +
                " VALUES (null,'bx_cha','男','2000-01-01','13888888888');";

        //String sql = "update table1_actor set name='zhou' where id = 1";
        // String sql = "delete from table1_actor";

        //statement 用于执行静态 SQL 语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();

        // 如果是 dml 语句，返回的就是影响行数
        int rows = statement.executeUpdate(sql);
        if (rows > 0) {
            System.out.println("执行成功");
        } else {
            System.out.println("执行失败");
        }

        // 关闭资源
        statement.close();
        connect.close();
    }
}
