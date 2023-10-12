package com.bx_cha.jdbc.myjdbc;

/**
 * @author bx_cha
 * @version 1.0
 */
public class Oracle_jdbc_Impl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("连接oracle");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("crud");

    }

    @Override
    public void close() {
        System.out.println("关闭oracle连接");
    }
}
