package com.example.adward.qq.app;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by Adward on 2016/12/31.
 */

public class QQApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(getApplicationContext(),"06c4daa7a23c79c03323670fa7f43b5b");
    }
}
