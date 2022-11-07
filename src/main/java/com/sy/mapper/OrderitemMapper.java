package com.sy.mapper;

import com.sy.pojo.Orderitem;
import org.apache.ibatis.annotations.Param;

public interface OrderitemMapper {




    /**
     * 根据id删除
     */
    void DeleteById(int id);


    /**
     * 添加
     */

    void Add(Orderitem orderitem) ;
    /*
    批量删除
    * */
    void DeleteByIds(@Param("ids") int[] ids);
}
