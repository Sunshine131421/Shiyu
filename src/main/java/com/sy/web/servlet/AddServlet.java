package com.sy.web.servlet;

import com.alibaba.fastjson.JSON;
import com.sy.pojo.Orderitem;
import com.sy.service.OrderitemService;
import com.sy.service.impl.OrderitemImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

//@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    private OrderitemService orderitemService=new OrderitemImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.接受品牌数据
        BufferedReader or=req.getReader();
        String params=or.readLine();//json字符串
        //转为静态Orderitem对象
        Orderitem orderitem=JSON.parseObject(params,Orderitem.class);
        //调用Servlet添加
        orderitemService.Add(orderitem);
       //Servlet成功响应
        resp.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

