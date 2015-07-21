package com.logitravel.logihotels.done.api;

import com.logitravel.logihotels.done.model.Hotel;

import java.util.List;

import retrofit.http.GET;

public interface HotelApi {
    @GET("api/hotel/{city}") List<Hotel> getHotels(int city);
}
