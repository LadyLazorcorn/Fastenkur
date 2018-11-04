package com.lazorcorn.fastenkur.di.components;

import com.lazorcorn.fastenkur.di.module.FastenCureModule;
import com.lazorcorn.fastenkur.di.scope.PerActivity;

import dagger.Component;

@PerActivity
@Component(modules = FastenCureModule.class, dependencies = ApplicationComponent.class)
public interface FastenCureComponent {
}
