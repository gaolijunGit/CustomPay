package com.yk.custompay.model;

public class RechargeModel {

    //乐推订单ID
    private String lt_order_id;
    //类型
    private String lt_type;
    //单位
    private String goods_price_type;
    //价格
    private double goods_price;
    //订单号
    private String order_number ;

    public String getLt_order_id() {
        return lt_order_id;
    }

    public void setLt_order_id(String lt_order_id) {
        this.lt_order_id = lt_order_id;
    }

    public String getLt_type() {
        return lt_type;
    }

    public void setLt_type(String lt_type) {
        this.lt_type = lt_type;
    }

    public String getGoods_price_type() {
        return goods_price_type;
    }

    public void setGoods_price_type(String goods_price_type) {
        this.goods_price_type = goods_price_type;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }
}
