package com.code.yashladha.android_user.Models;

public class Order {
    private String order_id;
    private String status;
    private long pay_id;
    private String uid;
    private int quantity;
    private String sellerId;
    private String productName;
    private String order_date;
    private String del_date;

    public Order() {
    }

    public Order(String order_id, String status, long pay_id, String uid, int quantity, String sellerId, String productName, String order_date, String del_date) {
        this.order_id = order_id;
        this.status = status;
        this.pay_id = pay_id;
        this.uid = uid;
        this.quantity = quantity;
        this.sellerId = sellerId;
        this.productName = productName;
        this.order_date = order_date;
        this.del_date = del_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDel_date(String del_date) {
        this.del_date = del_date;
    }

    public String getStatus() {
        return status;
    }

    public long getPay_id() {
        return pay_id;
    }

    public String getUid() {
        return uid;
    }

    public String getDel_date() {
        return del_date;
    }

    public String getOrder_date() {
        return order_date;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPay_id(long pay_id) {
        this.pay_id = pay_id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }
}