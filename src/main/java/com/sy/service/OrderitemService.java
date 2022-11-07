package com.sy.service;

import com.sy.pojo.Orderitem;
import org.apache.ibatis.annotations.Param;

public interface OrderitemService {
/**
 * 添加
 */
void Add(Orderitem orderitem);
/*
* 批量删除*/
    void DeleteByIds(int[] ids);
    /*
    * 单个删除*/
    void DeleteById(int id);
}


