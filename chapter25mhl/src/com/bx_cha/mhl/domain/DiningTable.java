package com.bx_cha.mhl.domain;

/**
 * @author bx_cha
 * @version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * id        int primary key auto_increment, # id
 * state     varchar(20) not null default '',# 状态
 * orderName varchar(50) not null default '',# 预定人名称
 * orderTel  varchar(20) not null default '' # 预定人电话
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiningTable {

    private int id;
    private String state;
    private String orderName;
    private String orderTel;

    @Override
    public String toString() {
        return id + "\t\t" + state;
    }
}
