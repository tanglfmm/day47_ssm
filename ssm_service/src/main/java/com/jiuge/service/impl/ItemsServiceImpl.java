/**
 * Created by Tanglf
 * 2021-06-07 18:16
 */
package com.jiuge.service.impl;

import com.jiuge.bean.Items;
import com.jiuge.dao.ItemsDao;
import com.jiuge.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/** 5.3创建ItemsService接口（抽象方法）+实现类（注入dao层对象，@Service @Transactional） */
@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    //注入dao对象
    @Autowired
    private ItemsDao dao;
    public List<Items> findAll() {
        List<Items> list=dao.findAll();
        return list;
    }

    public int add(Items items) {
        int rows=dao.add(items);
        return rows;
    }
}
