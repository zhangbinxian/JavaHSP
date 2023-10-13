package com.bx_cha.mhl.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bx_cha
 * @version 1.0
 */

/**
 * 这是一个javabean 和 employee对应
 * id    int primary key auto_increment, # 自增
 * empId varchar(50) not null default '',
 * pwd   char(32)    not null default '',
 * name  varchar(50) not null default '',
 * job   varchar(50) not null default ''
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String empId;
    private String pwd;
    private String name;
    private String job;
}
