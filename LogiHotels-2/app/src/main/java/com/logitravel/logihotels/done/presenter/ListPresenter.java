package com.logitravel.logihotels.done.presenter;

import com.logitravel.logihotels.done.api.HotelApi;
import com.logitravel.logihotels.done.internal.ScreenDirector;
import com.logitravel.logihotels.done.internal.injection.Injector;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.view.IHotelListView;

public class ListPresenter {
    private final ScreenDirector screenDirector;
    private final HotelApi hotelApi;
    private IHotelListView view;

    private Hotel[] hotels;

    public ListPresenter(final IHotelListView view) {
        this.view = view;
        screenDirector = Injector.getInstance().getScreenDirector();
        hotelApi = Injector.getInstance().getHotelApi();

        //TODO: Load the hotels from the API
    }

    public void onHotelClicked(Hotel hotel) {
        //TODO: What to do when a hotel is clicked?
    }

    public void onShowMapClicked() {
        //TODO: Top right icon clicked
    }
}
