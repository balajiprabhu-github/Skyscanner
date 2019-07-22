package com.balajiprabhu.skyscanner.network;

import com.balajiprabhu.skyscanner.network.model.BaseQuotes;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SkyScannerService {


    @Headers({
            "X-RapidAPI-Key: 4fc318d903mshf57c0a4b90734bep15668djsn0fa8ed47953a",
    })
    @GET("browsequotes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}")
    Observable<BaseQuotes> getQuotes(
            @Path("country") String country,
            @Path("currency") String currency,
            @Path("locale") String locale,
            @Path("originplace") String originplace,
            @Path("destinationplace") String destinationplace,
            @Path("outboundpartialdate") String outboundpartialdate,
            @Query("inboundpartialdate") String inboundpartialdate);


    @Headers({
            "X-RapidAPI-Key: 4fc318d903mshf57c0a4b90734bep15668djsn0fa8ed47953a",
    })
    @GET("/browseroutes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}")
    Observable<BaseQuotes> getRoutes(
            @Path("country") String country,
            @Path("currency") String currency,
            @Path("locale") String locale,
            @Path("originplace") String originplace,
            @Path("destinationplace") String destinationplace,
            @Path("outboundpartialdate") String outboundpartialdate,
            @Query("inboundpartialdate") String inboundpartialdate);


}
