package com.logitravel.logihotels.done.internal.injection;

import com.logitravel.logihotels.done.api.HotelApi;

import retrofit.RestAdapter;

public class ApiModule {
    public RestAdapter provideRestAdapter(String endpoint) {
        return new RestAdapter.Builder()
                .setEndpoint(endpoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

    public HotelApi provideHotelApi(RestAdapter restAdapter) {
        return restAdapter.create(HotelApi.class);
    }
}
