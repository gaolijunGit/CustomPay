package com.yk.custompay.model;

import static com.yk.custompay.model.Result.STATE_RECHARGE_FAILED;
import static com.yk.custompay.model.Result.STATE_RECHARGE_SUCCESS;

public class RechargeResult {

    private String errorMsg;
    private int code;
    private BaseEntry<RechargeModel> resultModel;


    public RechargeResult(int state, String msg) {
        this.code = state;
        this.errorMsg = msg;
    }

    public RechargeResult(int state) {
        this.code = state;
    }

    public RechargeResult(String msg) {
        this.errorMsg = msg;
    }

    private RechargeResult(int state, BaseEntry<RechargeModel> resultModel) {
        this.code = state;
        this.resultModel = resultModel;
    }




    public static RechargeResult successOf() {
        return new RechargeResult(STATE_RECHARGE_SUCCESS);
    }

    public static RechargeResult successOf(BaseEntry<RechargeModel> resultModel) {
        RechargeResult result = new RechargeResult(STATE_RECHARGE_SUCCESS, resultModel);
        result.resultModel = resultModel;
        return result;

    }


    public static RechargeResult failOf(String errorMsg) {
        RechargeResult result = new RechargeResult(STATE_RECHARGE_FAILED, errorMsg);
        result.errorMsg = errorMsg;
        return result;
    }

    public static RechargeResult failOf(int code, String errorMsg) {
        RechargeResult result = new RechargeResult(code, errorMsg);
        result.errorMsg = errorMsg;
        return result;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



    public BaseEntry<RechargeModel> getResultModel() {
        return resultModel;
    }

    public void setResultModel(BaseEntry<RechargeModel> resultModel) {
        this.resultModel = resultModel;
    }
}
