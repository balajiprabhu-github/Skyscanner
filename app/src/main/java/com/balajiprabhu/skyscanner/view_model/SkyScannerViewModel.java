package com.balajiprabhu.skyscanner.view_model;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import com.balajiprabhu.skyscanner.network.SkyScannerServiceManager;
import com.balajiprabhu.skyscanner.network.model.BaseQuotes;

import javax.inject.Inject;

public class SkyScannerViewModel extends ViewModel implements LifecycleObserver {
    
    private static final String TAG = "SkyScannerViewModel";

    private SkyScannerServiceManager skyScannerServiceManager;

    @Inject
    public SkyScannerViewModel(SkyScannerServiceManager skyScannerServiceManager) {
        this.skyScannerServiceManager = skyScannerServiceManager;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void init(){
        getQuotes();
    }

    private void getQuotes(){

        skyScannerServiceManager.getQuotes().subscribe(this::onSuccess,this::onFailure,this::onCompleted);

    }

    private void onSuccess(BaseQuotes baseQuotes){
        Log.d(TAG, "onSuccess: "+baseQuotes );
    }

    private void onFailure(Throwable throwable){
        Log.d(TAG, "onFailure: "+throwable.getLocalizedMessage());
    }

    private void onCompleted(){
        Log.d(TAG, "onCompleted: ");
    }
    
}
