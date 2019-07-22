package com.balajiprabhu.skyscanner.network;

import com.balajiprabhu.skyscanner.network.model.BaseQuotes;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SkyScannerServiceManager {

    SkyScannerService skyScannerService;

    @Inject
    public SkyScannerServiceManager(SkyScannerService skyScannerService) {
        this.skyScannerService = skyScannerService;
    }

    public Observable<BaseQuotes> getQuotes(String country, String currency, String locale, String originplace, String destinationplace, String outboundpartialdate, String inboundpartialdate) {
        return skyScannerService.getQuotes(country, currency, locale, originplace, destinationplace, outboundpartialdate, inboundpartialdate).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
