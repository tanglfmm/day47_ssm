/**
 * Created by Tanglf
 * 2021-06-07 17:21
 */
package com.jiuge.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
/** 3.2创建Items对象类  */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
