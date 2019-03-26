package com.lightweh.face;

import android.annotation.SuppressLint;
import android.app.Application;

import com.blankj.utilcode.util.CrashUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;

/**
 * Created by yangk on 2019/1/28.
 */

public class MyAppcation extends Application {

    @SuppressLint("MissingPermission")
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());

        CrashUtils.init(new CrashUtils.OnCrashListener() {
            @Override
            public void onCrash(String crashInfo, Throwable e) {
                LogUtils.d(crashInfo);
            }
        });
    }
}
