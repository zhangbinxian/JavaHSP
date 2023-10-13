package com.bx_cha.mhl.service;

import com.bx_cha.mhl.dao.MenuDAO;
import com.bx_cha.mhl.domain.Menu;

import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 * 完成对menu表的各种操作(通过调用MenuDAO)
 */
public class MenuService {

    //定义一个 MenuDAO 属性
    private MenuDAO menuDAO = new MenuDAO();

    // 返回所有的菜品，给界面使用
    public List<Menu> list() {
        String sql = "select * from menu";
        return menuDAO.queryMulti(sql, Menu.class);
    }

    //需要方法，根据id, 返回Menu对象
    public Menu getMenuById(int id) {
        String sql = "select * from menu where id = ?";
        return menuDAO.querySingle(sql, Menu.class, id);
    }
}
