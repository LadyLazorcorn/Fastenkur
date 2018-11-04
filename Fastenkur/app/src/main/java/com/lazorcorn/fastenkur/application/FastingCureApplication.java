package com.lazorcorn.fastenkur.application;

import android.app.Application;

public class FastingCureApplication extends Application {
    //extends Application which is a singelton of this whole App

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
