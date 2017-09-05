package com.huzhou.feidian.coolweather2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.huzhou.feidian.coolweather2.service.AutoUpdateService;

/**
 * Created by Administrator on 2017/9/5.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
