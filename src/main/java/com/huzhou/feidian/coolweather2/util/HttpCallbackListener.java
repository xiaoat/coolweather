package com.huzhou.feidian.coolweather2.util;

/**
 * Created by Administrator on 2017/9/2.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
