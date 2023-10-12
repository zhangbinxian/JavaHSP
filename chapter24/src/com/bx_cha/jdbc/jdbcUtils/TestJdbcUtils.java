package com.bx_cha.jdbc.jdbcUtils;

import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * @author bx_cha
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TestJdbcUtils {

    @Test
    public void testDML() throws SQLException {

        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "insert into table1_actor(id, name, sex, borndate, phone) VALUES (null,?,?,?,?)";
        // String sql = "delete * from table1_actor where name=?";
        // String sql = "update table1_actor set name=? where name=?";

        PreparedStatement preparedStatement = null;

        try {
            // 加载驱动(utils静态代码块加载驱动)，建立连接
            connection = JDBCUtils.getConnection();


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "ins");
            preparedStatement.setString(2, "女");
            preparedStatement.setDate(3, Date.valueOf("2001-01-24"));
            preparedStatement.setString(4, "15666666666");

            int rows = preparedStatement.executeUpdate();

            if (rows > 0) {
                System.out.println("dml 成功");
            } else {
                System.out.println("dml 失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }

    }

    @Test
    public void testDQL() throws SQLException {

        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "select * from table1_actor where sex=? ";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动(utils静态代码块加载驱动)，建立连接
            connection = JDBCUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "女");


            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);//获取该行的第1列
                String name = resultSet.getString(2);//获取该行的第2列
                String sex = resultSet.getString(3);//获取该行的第3列
                Date borndata = resultSet.getDate(4);//获取该行的第4列

                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndata);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }

    }
}
