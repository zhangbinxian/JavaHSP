package com.bx_cha.mhl.domain;

/**
 * @author bx_cha
 * @version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * id    int primary key auto_increment,
 * name  varchar(50) not null default '',
 * type  varchar(50) not null default '',
 * price double      not null default 0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private Integer id;
    private String name;
    private String type;
    private Double price;

    @Override
    public String toString() {
        return id + "\t\t\t" + name + "\t\t" + type + "\t\t" + price;

    }
}
