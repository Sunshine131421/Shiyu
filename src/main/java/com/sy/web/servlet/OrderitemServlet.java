package com.sy.web.servlet;

import com.alibaba.fastjson.JSON;
import com.sy.pojo.Orderitem;
import com.sy.service.OrderitemService;
import com.sy.service.impl.OrderitemImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/orderitem/*")
public class OrderitemServlet extends BaseServlet{
    private OrderitemService orderitemService=new OrderitemImpl();
   public void Add(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       //1.接受品牌数据
       BufferedReader or=req.getReader();
       String params=or.readLine();//json字符串
       //转为静态Orderitem对象
       Orderitem orderitem= JSON.parseObject(params,Orderitem.class);
       //调用Servlet添加
       orderitemService.Add(orderitem);
       //Servlet成功响应
       resp.getWriter().write("success");

   }
    public void DeleteByIds(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
       //1.接收数组[1,2,3]
        BufferedReader or=req.getReader();
        String params=or.readLine();//json字符串
        //转为静态Orderitem对象
     int[] ids= JSON.parseObject(params,int[].class);
        //调用Servlet删除
        orderitemService.DeleteByIds(ids);
        //Servlet成功响应标识
        resp.getWriter().write("success");

    }
    public void DeleteById(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //1.接受品牌数据
        BufferedReader or=req.getReader();
        String params=or.readLine();//json字符串
        //转为静态Orderitem对象
        int id= JSON.parseObject(params,int.class);
        //调用Servlet删除
        orderitemService.DeleteById(id);
        //Servlet成功响应
        resp.getWriter().write("success");

    }
}
