package com.bx_cha.jdbc.myjdbc;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 模拟mysql实现了jdbc接口方法
 */
public class MySql_jdbc_Impl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("连接mysql");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("crud");

    }

    @Override
    public void close() {
        System.out.println("关闭mysql连接");
    }
}
