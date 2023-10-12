package com.bx_cha.jdbc.myjdbc;

/**
 * @author bx_cha
 * @version 1.0
 */
public class TestJdbc {
    public static void main(String[] args) {
        JdbcInterface mysql = new MySql_jdbc_Impl();
        // 通过接口动态绑定
        mysql.getConnection();
        mysql.crud();
        mysql.close();

        System.out.println("========================");
        JdbcInterface oracle = new Oracle_jdbc_Impl();

        oracle.getConnection();
        oracle.crud();
        oracle.close();
    }
}

