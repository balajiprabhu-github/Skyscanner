package com.balajiprabhu.skyscanner.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;

import android.os.Bundle;
import android.util.Log;

import com.balajiprabhu.skyscanner.R;
import com.balajiprabhu.skyscanner.databinding.ActivityMainBinding;
import com.balajiprabhu.skyscanner.network.SkyScannerServiceManager;
import com.balajiprabhu.skyscanner.network.model.BaseQuotes;
import com.balajiprabhu.skyscanner.view_model.SkyScannerViewModel;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {


    @Inject
    SkyScannerViewModel skyScannerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        this.getLifecycle().addObserver(skyScannerViewModel);
        activityMainBinding.setViewModel(skyScannerViewModel);

    }


}
