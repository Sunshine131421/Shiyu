package com.sy.pojo;

public class Orderitem {
    private int id;
    private int ordersid;
    private int productid;
    private String quantity;

    @Override
    public String toString() {
        return "Orderitem{" +
                "id=" + id +
                ", ordersid=" + ordersid +
                ", productid=" + productid +
                ", quantity='" + quantity + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(int ordersid) {
        this.ordersid = ordersid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
