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

import com.example.pr1.databinding.ActivityP3Binding;

public class p3 extends AppCompatActivity {
    TextView amenities;
    int userId;
    String userName;
    private AppBarConfiguration appBarConfiguration;
    private ActivityP3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");
        binding = ActivityP3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
                    finish(); // closes the activity and returns to the previous screen
                });
        // Find views

        amenities=(TextView) findViewById(R.id.txtamenities);
        amenities.setText(
                "Shared beach access" + "\n" + "Kitchen" + "\n" + "Wifi" + "\n" +
                        "Free parking on premises" + "\n" +
                        "TV" + "\n" + "Washer\n" +
                        "AC - split type ductless system\n" +
                        "Luggage dropoff allowed\n" +
                        "Unavailable: Carbon monoxide alarm\n" +
                        "Unavailable: Smoke alarm");

        // Array of image resource IDs
        int[] images = { R.drawable.l3livingroom1, R.drawable.l3livingroom2, R.drawable.l3livingroom3,R.drawable.l3livingroom4,R.drawable.l3livingroom5, R.drawable.l3kitchen1, R.drawable.l3kitchen2 ,R.drawable.l3kitchen3, R.drawable.l3kitchen4, R.drawable.l3bedroom1, R.drawable.l3bedroom2, R.drawable.l3bedroom3, R.drawable.l3exterior1, R.drawable.l3exterior2,R.drawable.l3exterior3, R.drawable.l3additional1, R.drawable.l3additional2,  R.drawable.l3additional3,  R.drawable.l3bathroom };
        // Optional: descriptions for each image
        String[] descriptions = { "Living room", "Living room", "Living room", "Living room", "Living room", "Kitchen","Kitchen","Kitchen","Kitchen","Bedroom","Bedroom","Bedroom","Exterior","Exterior","Exterior","Additional","Additional","Additional","Bathroom"};

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
            counter.setText((i+1) + "/" + images.length);
            desc.setText(descriptions[i]);

            // Add to container
            imageContainer.addView(itemView);
        }

        Button btnReserve = findViewById(R.id.btnReserve);

        btnReserve.setOnClickListener(v -> {
            // Example: open ReserveActivity
            // Pass apartment details
            Intent intent = new Intent(p3.this, reserve.class);
            intent.putExtra("apartmentName", "Chalet with a Sea View in Batroun 24/7 Electricity");
            intent.putExtra("basePrice", 100); //
            // example base price
            // Pass logged-in user info
            intent.putExtra("user_id", userId);
            intent.putExtra("user_name", userName);

            startActivity(intent);
        });
        Button btnShowmore = findViewById(R.id.btnshowmore);

        btnShowmore.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p3.this, description3.class);
            startActivity(intent);
        });
        Button btnShowamenities = findViewById(R.id.btnshowallamenities);

        btnShowamenities.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p3.this, amenities3.class);
            startActivity(intent);
        });



    }


}