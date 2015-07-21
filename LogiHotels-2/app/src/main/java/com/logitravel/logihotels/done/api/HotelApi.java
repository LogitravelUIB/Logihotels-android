package com.logitravel.logihotels.done.api;

import com.logitravel.logihotels.done.model.Hotel;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface HotelApi {
    //TODO: Pass the correct arguments
    @GET("api/hotel/{city}") List<Hotel> getHotels(@Path("city") int city);
}
