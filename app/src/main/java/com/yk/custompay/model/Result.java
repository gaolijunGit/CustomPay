package com.yk.custompay.model;

public class Result {

    private static final int BASE_CODE = 0X01;
    //创建订单失败
    public static final int STATE_GP_CREATE_ORDER_FAILED = BASE_CODE + 1;
    //支付成功
    public static final int STATE_RECHARGE_SUCCESS = BASE_CODE + 2;
    //支付失败
    public static final int STATE_RECHARGE_FAILED = BASE_CODE + 3;


}
