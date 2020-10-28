package com.yk.custompay

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yk.custompay.databinding.ActivityMainBinding
import com.yk.custompay.impl.OnRechargeListener
import com.yk.custompay.model.Result
import com.yk.custompay.util.GPHelper

class MainActivity : AppCompatActivity() {

    lateinit var mGPHelper: GPHelper
    private var mGoodsNumber = ""
    private var mPayTest: Int = 0
    private var mSku: String = ""
    private var mParams: Map<String, Any>? = null
    private var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        initView()
        initData()

    }

    private fun initView() {
        mBinding!!.btnPay.setOnClickListener {
            mGPHelper = GPHelper(this, mGoodsNumber, mPayTest, mSku, mParams,
                OnRechargeListener { activity, result ->
                    when (result.code) {
                        Result.STATE_GP_CREATE_ORDER_FAILED -> {//创建订单失败
                           mBinding!!.txtResult.text=result.errorMsg
                        }
                        Result.STATE_RECHARGE_SUCCESS -> {//支付成功\
                            Log.e("TAG", result.resultModel.data.toString())
                            mBinding!!.txtResult.text=result.resultModel.data.toString()

                        }
                        Result.STATE_RECHARGE_FAILED -> {//支付失败
                            when (result.errorMsg) {
                                "-1" -> {

                                }
                                "-2" -> {

                                }
                                "-3" -> {

                                }
                                "1" -> {

                                }
                                "2" -> {

                                }
                                "3" -> {

                                }
                                "4" -> {

                                }
                                "5" -> {

                                }
                                "6" -> {

                                }
                                "8" -> {

                                }
                            }

                        }

                    }
                })
            mGPHelper.init()
        }
    }

    /**
     * 初始化数据
     */
    private fun initData() {
        mGPHelper = GPHelper(this, mPayTest)
        mGPHelper.addOrder()
    }
}