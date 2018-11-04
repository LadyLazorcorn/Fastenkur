package com.lazorcorn.fastenkur.di.module;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApplicationModule {

    private String mBaseUrl; //this string should be provided via the constructor:
    private Context mContext;
    public ApplicationModule(Context context, String baseUrl){
        mContext = context;
        mBaseUrl =baseUrl;
    }

    @Singleton
    @Provides
    GsonConverterFactory provideGsonConverterFactory() {
        GsonConverterFactory factory = GsonConverterFactory.create();
        return factory;
    }

    @Singleton
    @Provides
    @Named("ok-1")
    OkHttpClient provideOkHttpClient1(){
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    @Named("ok-2")
    OkHttpClient provideOkHttpClient2(){
        return new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    RxJavaCallAdapterFactory rxJavaCallAdapterFactory(){
        return RxJavaCallAdapterFactory.create(); //create is a static method here
    }

    //this module provides a Retrofit instance:
    @Singleton
    @Provides
    Retrofit provideRetrofit(@Named("ok-1") OkHttpClient client, GsonConverterFactory converterFactory, RxJavaCallAdapterFactory adapterFactory) {
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build();
    }

    @Singleton
    @Provides
    Context provideContext(){
        return mContext;
    }
}
