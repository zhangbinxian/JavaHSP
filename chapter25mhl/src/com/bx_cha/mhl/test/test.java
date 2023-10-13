package com.bx_cha.mhl.test;

import com.bx_cha.mhl.utils.JDBCUtilsByDruid;
import com.bx_cha.mhl.view.MhlView;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author bx_cha
 * @version 1.0
 */
public class test {
    @Test
    public void test() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);
    }

    @Test
    public static void main(String[] args) {
        // new MhlView().mainMenu();
        new MhlView().listBill();

    }
}
