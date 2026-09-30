package com.example.pr1;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ApartmentAdapter extends BaseAdapter {
    Context context;
    String[] apartmentNames;
    int[] apartmentImages;
    LayoutInflater inflater;
    int userId;
    String userName;
    Set<String> currentWishlist;

    public ApartmentAdapter(Context context, String[] apartmentNames, int[] apartmentImages, int userId, String userName, Set<String> currentWishlist) {
        this.context = context;
        this.apartmentNames = apartmentNames;
        this.apartmentImages = apartmentImages;
        this.userId = userId; this.userName = userName;
        this.currentWishlist = currentWishlist;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return apartmentNames.length;
    }

    @Override
    public Object getItem(int position) {
        return apartmentNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row, parent, false);
        }

        ImageButton ivApartment = convertView.findViewById(R.id.btnApartment);
        TextView tvApartmentName = convertView.findViewById(R.id.tvApartmentName);
        ToggleButton toggle = convertView.findViewById(R.id.togglebutton);
        String apartmentName = apartmentNames[position];
        ivApartment.setImageResource(apartmentImages[position]);
        tvApartmentName.setText(apartmentNames[position]);
        toggle.setOnCheckedChangeListener(null);
        toggle.setChecked(currentWishlist.contains(apartmentName));
        toggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String url = "http://192.168.11.221/projectmb/wishlist_action.php";
            StringRequest req = new StringRequest(Request.Method.POST, url, response -> {
                if (isChecked) {
                    currentWishlist.add(apartmentName);
                    Toast.makeText(context, apartmentName + " added", Toast.LENGTH_SHORT).show();
                }
                else { currentWishlist.remove(apartmentName); Toast.makeText(context, apartmentName + " removed", Toast.LENGTH_SHORT).show();
                } }, error ->
                    Toast.makeText(context, "Error: " + error.toString(), Toast.LENGTH_SHORT).show() ) {
                @Override protected Map<String, String> getParams() {
                    Map<String, String> params = new HashMap<>();
                    params.put("user_id", String.valueOf(userId));
                    params.put("apartment", apartmentName);
                    params.put("action", isChecked ? "add" : "remove");
                    return params;
                } };
            Volley.newRequestQueue(context).add(req); });
        // Handle click for each apartment
        ivApartment.setOnClickListener(v -> {
            Intent intent;
            switch (position) {
                case 0: intent = new Intent(context, p1.class);
                    break;
                case 1: intent = new Intent(context, p2.class);
                    break;
                case 2: intent = new Intent(context, p3.class);
                    break;
                case 3: intent = new Intent(context, p4.class);
                    break;
                case 4: intent = new Intent(context, p5.class);
                    break;
                case 5: intent = new Intent(context, p6.class);
                    break;
                case 6: intent = new Intent(context, p7.class);
                    break;
                case 7: intent = new Intent(context, p8.class);
                    break;
                case 8: intent = new Intent(context, p9.class);
                    break;
                case 9: intent = new Intent(context, p10.class);
                    break;
                default: intent = new Intent(context, p1.class);
                    // fallback
                    break;
            }
            intent.putExtra("apartment_id", position + 1); // pass the correct apartment number
            intent.putExtra("user_id", userId);
            intent.putExtra("user_name", userName);
            context.startActivity(intent);
        });


        return convertView;
    }

}
