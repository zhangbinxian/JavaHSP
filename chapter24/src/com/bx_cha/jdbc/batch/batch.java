package com.bx_cha.jdbc.batch;

import com.bx_cha.jdbc.jdbcUtils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author bx_cha
 * @version 1.0
 * 批处理
 */
@SuppressWarnings({"all"})
public class batch {

    // 传统方法，添加5000条数据到table2_admin
    @Test
    public void noBatch() throws SQLException {

        Connection connection = JDBCUtils.getConnection();

        String sql = "insert into table2_admin(id,username,password) values (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "bx_cha" + i);
            preparedStatement.setString(2, "pwd" + i);
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();

        System.out.println("传统dml方法时间" + (end - start));//传统dml方法时间4429
        JDBCUtils.close(null, preparedStatement, connection);
    }

    @Test
    public void useBatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();

        String sql = "insert into table2_admin(id,username,password) values (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "bx_cha" + i);
            preparedStatement.setString(2, "pwd" + i);
            // 将sql语句加入到批处理包
            preparedStatement.addBatch();
            // 当有1000条记录时，处理
            if((i+1)%1000==0){
                preparedStatement.executeBatch();
                // 清空
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("批量dml方法时间" + (end - start));//批量dml方法时间70
        JDBCUtils.close(null, preparedStatement, connection);
    }
}
