package com.logitravel.logihotels.done.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.logitravel.logihotels.R;
import com.logitravel.logihotels.done.model.Hotel;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class HotelsAdapter extends BaseAdapter {
    private static final String TAG = "HotelsAdapter";

    List<Hotel> hotels = new ArrayList<>();

    public HotelsAdapter() {
    }

    public void add(Hotel hotel) {
        hotels.add(hotel);
        notifyDataSetChanged();
    }

    public void add(List<Hotel> hotels) {
        this.hotels.addAll(hotels);
        notifyDataSetChanged();
    }

    public void clearHotels() {
        hotels.clear();
        notifyDataSetChanged();
    }

    @Override public int getCount() {
        return hotels.size();
    }

    @Override public Hotel getItem(int position) {
        return hotels.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            //TODO: Implement the adapter
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_hotel, parent, false);
            ViewHolder holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        Hotel hotel = getItem(position);
        ViewHolder holder = (ViewHolder) convertView.getTag();

        bind(hotel, holder);

        return convertView;
    }

    private void bind(Hotel hotel, ViewHolder holder) {
        //TODO: Fill the holder with hotel info
    }

    private void loadNotFoundImage(ImageView imageView) {
        //TODO: load the 'no_image' drawable into the ImageView
    }

    private void loadImageUrl(ImageView imageView, String imageUrl) {
        //TODO: Use Picasso to load the image
    }

    public Hotel[] getHotels() {
        return hotels.toArray(new Hotel[hotels.size()]);
    }

    public static class ViewHolder {
        //TODO: Bind the views here

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
