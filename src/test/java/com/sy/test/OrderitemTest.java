package com.sy.test;

import com.sy.mapper.OrderitemMapper;
import com.sy.pojo.Orderitem;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class OrderitemTest {
    @Test
    public void testAdd() throws Exception {
    //接收参数
    int id =5;
    int ordersid=8;
    int productid=9;
    String quantity="hello";
    //封装对象
    Orderitem orderitem=new Orderitem();
    orderitem.setId(id);
    orderitem.setOrdersid(ordersid);
    orderitem.setProductid(productid);
    orderitem.setQuantity(quantity);



    //1.获取SqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //2.获取SqlSession对象
    SqlSession sqlSession = sqlSessionFactory.openSession();

    //3.获取Mapper接口的代理对象
    OrderitemMapper orderitemMapper = sqlSession.getMapper(OrderitemMapper.class);

    //4.执行方法
    orderitemMapper.Add(orderitem);
    Integer count = orderitem.getId();
    System.out.println(count);
    //提交事务
    sqlSession.commit();
    //5.释放资源
    sqlSession.close();


}
@Test
    public void testDeleteById() throws IOException, IOException {
        //接收参数

        int id = 9;
        //1.获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2.获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        OrderitemMapper orderitemMapper = sqlSession.getMapper(OrderitemMapper.class);


        //4.执行方法
        orderitemMapper.DeleteById(id);
        //提交事务
        sqlSession.commit();
        //5.释放资源
        sqlSession.close();

    }

}
