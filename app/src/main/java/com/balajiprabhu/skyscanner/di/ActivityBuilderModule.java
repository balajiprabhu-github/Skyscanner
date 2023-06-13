package com.balajiprabhu.skyscanner.di;

import com.balajiprabhu.skyscanner.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract MainActivity providesMainActivity();
}

