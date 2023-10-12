package com.bx_cha.dao_.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author bx_cha
 * @version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private Integer id;
    private String name;
    private String sex;
    private Date borndate;
    private String phone;
}
