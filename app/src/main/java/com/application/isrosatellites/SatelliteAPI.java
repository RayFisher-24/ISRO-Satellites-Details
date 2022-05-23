package com.application.isrosatellites;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface SatelliteAPI {
    @GET
    Call<SatelliteModels> getAllNews(@Url String url);

    @GET
    Call<SatelliteModels> getNewsByCat(@Url String url);

}
