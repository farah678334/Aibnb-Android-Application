package com.example.pr1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pr1.databinding.ActivityP8Binding;

public class p8 extends AppCompatActivity {
    TextView amenities;
    int userId;
    String userName;
    private AppBarConfiguration appBarConfiguration;
    private ActivityP8Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");
        binding = ActivityP8Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
            finish(); // closes the activity and returns to the previous screen
        });
        // Find views

        amenities=(TextView) findViewById(R.id.txtamenities);
        amenities.setText("Courtyard view\n" +
                "Kitchen\n" +
                "Fast wifi – 130 Mbps\n" +
                "Free street parking\n" +
                "50 inch HDTV with Amazon Prime Video, Chromecast, Disney+, Netflix\n" +
                "Free washer – In unit\n" +
                "AC - split type ductless system\n" +
                "Private patio or balcony\n" +
                "Unavailable: Carbon monoxide alarm\n" +
                "Unavailable: Smoke alarm");

        // Array of image resource IDs
        int[] images = { R.drawable.t2livingroom1, R.drawable.t2livingroom2,R.drawable.t2livingroom3,R.drawable.t2livingroom4,R.drawable.t2bedroom1,R.drawable.t2bedroom2,R.drawable.t2bedroom3,R.drawable.t2bedroom4,R.drawable.t2diningarea1,  R.drawable.t2diningarea2,R.drawable.t2diningarea3,R.drawable.t2diningarea4, R.drawable.t2terrace1,R.drawable.t2terrace2,R.drawable.t2terrace3, R.drawable.t2kitchen1,R.drawable.t2kitchen2, R.drawable.t2additional1,R.drawable.t2laundryarea1,R.drawable.t2laundryarea2,R.drawable.t2bathroom1,R.drawable.t2bathroom2};
        // Optional: descriptions for each image
        String[] descriptions = { "Living room", "Living room","Living room","Living room","Bedroom","Bedroom","Bedroom","Bedroom","Dining area","Dining area","Dining area","Dining area","Terrace","Terrace","Terrace","Kitchen","Kitchen","Additional","Laundry area","Laundry area","bathroom","bathroom"};



        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
        LinearLayout imageContainer = findViewById(R.id.container);

        for (int i = 0; i < images.length; i++) {
            // Inflate your reusable item layout
            View itemView = getLayoutInflater().inflate(R.layout.item_image, imageContainer, false);

            ImageView iv = itemView.findViewById(R.id.itemImage);
            TextView counter = itemView.findViewById(R.id.itemCounter);
            TextView desc = itemView.findViewById(R.id.itemDescription);

            // Set image, counter, and description
            iv.setImageResource(images[i]);
            counter.setText((i + 1) + "/" + images.length);
            desc.setText(descriptions[i]);

            // Add to container
            imageContainer.addView(itemView);
        }

        Button btnReserve = findViewById(R.id.btnReserve);

        btnReserve.setOnClickListener(v -> {
            // Example: open ReserveActivity
            // Pass apartment details
            Intent intent = new Intent(p8.this, reserve.class);
            intent.putExtra("apartmentName", "Nice loft in the Jean Médecin neighborhood");
            intent.putExtra("basePrice", 97); //
            // example base price
            // Pass logged-in user info
            intent.putExtra("user_id", userId);
            intent.putExtra("user_name", userName);

            startActivity(intent);
        });
        Button btnShowmore = findViewById(R.id.btnshowmore);

        btnShowmore.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p8.this, description8.class);
            startActivity(intent);
        });
        Button btnShowamenities = findViewById(R.id.btnshowallamenities);

        btnShowamenities.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p8.this, amenities8.class);
            startActivity(intent);
        });

    }


}