package com.lazorcorn.fastenkur.di.module;

import com.lazorcorn.fastenkur.api.FastingCureApiService;
import com.lazorcorn.fastenkur.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class FastenCureModule {

    @PerActivity
    @Provides
    FastingCureApiService provideApiService(Retrofit retrofit){
        return retrofit.create(FastingCureApiService.class);
    }
}
