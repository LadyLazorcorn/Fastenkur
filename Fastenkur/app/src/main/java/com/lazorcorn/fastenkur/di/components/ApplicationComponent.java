package com.lazorcorn.fastenkur.di.components;

import android.content.Context;

import com.lazorcorn.fastenkur.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Retrofit exposeRetrofit();
    Context exposeContext();
    //void applyInjecttion(FastingCureApplication application); //what will be injected
}
