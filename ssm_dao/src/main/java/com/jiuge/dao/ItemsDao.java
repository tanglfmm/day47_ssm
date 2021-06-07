package com.jiuge.dao;
/*4.3创建ItemsDao接口，里面添加抽象方法 */
import com.jiuge.bean.Items;

import java.util.List;

public interface ItemsDao {

    List<Items> findAll();
    int add(Items items);

}
