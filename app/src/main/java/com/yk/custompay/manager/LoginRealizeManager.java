package com.yk.custompay.manager;

import android.app.Activity;

import com.yk.custompay.impl.OnRechargeListener;

import java.util.Map;

public class LoginRealizeManager {

    /**
     * 创建订单接口实现（这里需要自行实现）
     *
     * @param context    上下文
     * @param mProductID 商品ID
     * @param map        自定义数据
     * @param mListener  接口回调
     */
    public static void createOrder(final Activity context, String mProductID, Map<String, Object> map,
                                   final OnRechargeListener mListener) {

    }

    /**
     * 服务器验证
     *
     * @param context       上下文
     * @param purchaseToken Google返回的token
     * @param mOrderID      订单号
     * @param mPayTest      是否测试
     * @param mListener     接口回调
     */
    public static void googlePlay(final Activity context, String purchaseToken, String mOrderID,
                                  int mPayTest,
                                  final OnRechargeListener mListener) {
    }

    /**
     * 上传错误信息到服务器
     *
     * @param context       上下文
     * @param mGoogleOrder  订单号
     * @param purchaseToken Google返回的token
     * @param mOrderID      订单号
     * @param mPayTest      是否是测试服
     * @param msg           错误消息
     * @param mListener     接口回调
     */
    public static void sendGooglePlayFailed(final Activity context, String mGoogleOrder, String purchaseToken, String mOrderID,
                                            int mPayTest, String msg,
                                            final OnRechargeListener mListener) {
    }
}
