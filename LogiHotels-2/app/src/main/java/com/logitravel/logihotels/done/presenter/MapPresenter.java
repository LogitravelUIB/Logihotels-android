package com.logitravel.logihotels.done.presenter;

import com.logitravel.logihotels.done.MapActivity;
import com.logitravel.logihotels.done.internal.ScreenDirector;
import com.logitravel.logihotels.done.internal.injection.Injector;
import com.logitravel.logihotels.done.model.Hotel;
import com.logitravel.logihotels.done.view.IHotelMapView;

public class MapPresenter {
    private final ScreenDirector screenDirector;
    private IHotelMapView view;

    public MapPresenter(IHotelMapView view) {
        this.view = view;
        screenDirector = Injector.getInstance().getScreenDirector();
    }

    public void load(MapActivity.Arguments arguments) {
        //TODO: what to do when the map is loaded?
        //Hint: load the hotels and move the camera to the selected hotel if any!
    }

    public void onHotelSelected(Hotel hotel) {

    }

    public void onShowListClicked() {
        screenDirector.showHotelList();
    }
}
