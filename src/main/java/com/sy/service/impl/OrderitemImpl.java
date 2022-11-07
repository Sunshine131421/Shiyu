package com.sy.service.impl;

import com.sy.util.SqlSessionFactoryUtils;
import com.sy.mapper.OrderitemMapper;
import com.sy.pojo.Orderitem;
import com.sy.service.OrderitemService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class OrderitemImpl implements OrderitemService {
    //1.创建SqlSessionFactory工厂对象
    SqlSessionFactory factory= SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 添加
     */@Override
    public void Add(Orderitem orderitem){
        //1. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = factory.openSession();
        //2.获取OrderitemMapper
        OrderitemMapper orderitemMapper=sqlSession.getMapper(OrderitemMapper.class);
        //3.调用添加方法
        orderitemMapper.Add(orderitem);
        //4.提交事务
        sqlSession.commit();
        //5.释放资源
        sqlSession.close();
}

    @Override
    public void DeleteByIds(int[] ids) {
        //1. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = factory.openSession();
        //2.获取OrderitemMapper
        OrderitemMapper orderitemMapper=sqlSession.getMapper(OrderitemMapper.class);
        //3.调用方法
        orderitemMapper.DeleteByIds(ids);


        //4.提交事务
        sqlSession.commit();
        //5.释放资源
        sqlSession.close();

    }

    @Override
    public void DeleteById(int id) {
        //1. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = factory.openSession();
        //2.获取OrderitemMapper
        OrderitemMapper orderitemMapper=sqlSession.getMapper(OrderitemMapper.class);
        //3.调用删除方法
        orderitemMapper.DeleteById(id);
        //4.提交事务
        sqlSession.commit();
        //5.释放资源
        sqlSession.close();

    }


}
