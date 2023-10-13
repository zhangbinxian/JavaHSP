package com.bx_cha.mhl.service;

import com.bx_cha.mhl.dao.DiningTableDAO;
import com.bx_cha.mhl.domain.DiningTable;

import java.util.List;

/**
 * @author bx_cha
 * @version 1.0
 */
public class DiningTableService {

    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> list() {
        String sql = "select id,state from diningTable";
        return diningTableDAO.queryMulti(sql, DiningTable.class);
    }

    //根据id , 查询对应的餐桌DiningTable 对象
    //,如果返回null , 表示id编号对应的餐桌不存在
    public DiningTable getDiningTableById(int id) {
        String sql = "select * from diningTable where id = ?";
        return diningTableDAO.querySingle(sql, DiningTable.class, id);
    }

    //如果餐桌可以预定，调用方法，对其状态进行更新(包括预定人的名字和电话)
    public boolean orderDiningTable(int id, String orderName, String orderTel) {
        String sql = "update diningTable set state='已经预定',orderName=?,orderTel=? where id=?";
        int update = diningTableDAO.update(sql, orderName, orderTel, id);
        return update > 0;
    }

    //需要提供一个更新 餐桌状态的方法
    public boolean updateDiningTableState(int id, String state) {

        String sql = "update diningTable set state=? where id=?";
        int update = diningTableDAO.update(sql, state, id);
        return update > 0;
    }

    //提供方法，将指定的餐桌设置为空闲状态
    public boolean updateDiningTableToFree(int id, String state) {

        String sql = "update diningTable set state=?,orderName='',orderTel='' where id=?";

        int update = diningTableDAO.update(sql, state, id);
        return update > 0;
    }
}
