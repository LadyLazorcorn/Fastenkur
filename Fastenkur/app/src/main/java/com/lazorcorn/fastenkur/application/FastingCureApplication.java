package com.lazorcorn.fastenkur.application;

import android.app.Application;


import com.lazorcorn.fastenkur.di.components.DaggerApplicationComponent;

import dagger.Provides;

public class FastingCureApplication extends Application {
    //extends Application which is a singelton of this whole App

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

   // @Provides
    private void initializeApplicationComponent() {
        DaggerApplicationComponent.builder();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
