package com.bx_cha.mhl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bx_cha
 * @version 1.0
 * <p>
 * 这是一个javabean 可以和多张表进行对应
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiTableBean {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer nums;
    private Double money;
    private Integer diningTableId;
    private Date billDate;
    private String state;
    //增加一个来自menu表的列 name
    //思考 这里的属性名是否一定要和表的列名保持一致.
    //答: 可以不一致，但是需要sql做相应的修改, 规范需要保持一致.

    private String name;
    //增加来自menu表的列 price
    private Double price;//默认值 null


    @Override
    public String toString() {
        return  id +
                "\t\t" + menuId +
                "\t\t\t" + nums +
                "\t\t\t" + money +
                "\t\t" + diningTableId +
                "\t\t" + billDate +
                "\t\t" + state +
                "\t\t" + name +
                "\t\t" + price;
    }
}
