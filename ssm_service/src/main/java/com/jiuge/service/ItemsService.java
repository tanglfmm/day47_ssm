/**
 * Created by Tanglf
 * 2021-06-07 18:11
 */
package com.jiuge.service;

import com.jiuge.bean.Items;

import java.util.List;

/* 5.3创建ItemsService接口（抽象方法）+实现类（注入dao层对象，@Service @Transactional）
 */
public interface ItemsService {

    List<Items> findAll();
    int add(Items items);

}
