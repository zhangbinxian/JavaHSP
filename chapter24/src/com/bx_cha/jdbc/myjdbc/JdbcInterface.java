package com.bx_cha.jdbc.myjdbc;

/**
 * @author bx_cha
 * @version 1.0
 *
 * 定义我们自己规范的jdbc接口(方法)
 */
public interface JdbcInterface {

    // 连接
    public Object getConnection();

    //crud
    public void crud();

    // 关闭连接
    public void close();
}
