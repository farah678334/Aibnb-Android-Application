package com.example.pr1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class wishlistAdapter extends BaseAdapter {

    Context context;
    int[] apartmentImages;
    List<String> apartmentNames;
    LayoutInflater inflater;
    public wishlistAdapter(Context context, List<String> apartmentNames, int[] apartmentImages) {
        this.context = context;
        this.apartmentNames = apartmentNames;
        this.apartmentImages = apartmentImages;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return apartmentNames.size();
    }

    @Override
    public Object getItem(int position) {
        return apartmentNames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.wishlist_row, parent, false);
        }
        ImageButton ivApartment = convertView.findViewById(R.id.btnApartmentWishlist);
        TextView tvApartmentName = convertView.findViewById(R.id.tvApartmentNameWishlist);
        tvApartmentName.setText(apartmentNames.get(position));
        // Map name to image
        if (apartmentNames.get(position).equals("Achrafieh Rooftop 1-BR W Jacuzzi")) {
            ivApartment.setImageResource(R.drawable.ap1);
        } else if (apartmentNames.get(position).equals("Entire rental unit in Jumayza, Lebanon")) {
        ivApartment.setImageResource(R.drawable.ap2);
        } else if (apartmentNames.get(position).equals("Chalet with a Sea View in Batroun 24/7 Electricity")) {
            ivApartment.setImageResource(R.drawable.ap3); }
        else if (apartmentNames.get(position).equals("Blue Bird in Batroun Old Souks")) {
            ivApartment.setImageResource(R.drawable.ap4);
        } else if (apartmentNames.get(position).equals("100 m2 apartment, spacious and typical Parisian")) {
            ivApartment.setImageResource(R.drawable.ap5); }
        else if (apartmentNames.get(position).equals("Comfort a stone's throw from Montmartre")) {
            ivApartment.setImageResource(R.drawable.ap6);
        } else if (apartmentNames.get(position).equals("Palm Island: Elegant Oasis 1 Min from the Beach")) {
            ivApartment.setImageResource(R.drawable.ap7); }
        else if (apartmentNames.get(position).equals("Nice loft in the Jean Médecin neighborhood")) {
            ivApartment.setImageResource(R.drawable.ap8);
        } else if (apartmentNames.get(position).equals("Charming flat with stunning view")) {
            ivApartment.setImageResource(R.drawable.ap9); }
        else if (apartmentNames.get(position).equals("07 Superb Terrace, Heart of Cihangir, fibernet")) {
            ivApartment.setImageResource(R.drawable.ap10);
        }

        return convertView;
    }
}
