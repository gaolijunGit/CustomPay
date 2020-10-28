package com.yk.custompay.impl;

import android.app.Activity;

import com.yk.custompay.model.RechargeResult;

public interface OnRechargeListener {

    void onState(Activity activity, RechargeResult result);
}
