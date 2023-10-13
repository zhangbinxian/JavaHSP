package com.bx_cha.mhl.domain;

/**
 * @author bx_cha
 * @version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Bill 是javabean 和 bill对应
 * id int primary key auto_increment, #自增主键
 * billId varchar(50) not null default '',#账单号可以按照自己规则生成 UUID
 * menuId int not null default 0,#菜品的编号, 也可以使用外键
 * nums int not null default 0,#份数
 * money double not null default 0, #金额
 * diningTableId int not null default 0, #餐桌
 * billDate datetime not null ,#订单日期
 * state varchar(50) not null default '' # 状态 '未结账' , '已经结账', '挂单'
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer nums;
    private Double money;
    private Integer diningTableId;
    private Date billDate;
    private String state;

    @Override
    public String toString() {
        return id +
                "\t\t" + menuId +
                "\t\t\t" + nums +
                "\t\t\t" + money +
                "\t" + diningTableId +
                "\t\t" + billDate +
                "\t\t" + state;
    }
    public String toString2() {
        return id +
                "\t\t" + menuId +
                "\t\t\t" + nums +
                "\t\t\t" + money +
                "\t\t" + diningTableId +
                "\t\t" + billDate +
                "\t\t" + state;
    }
}
