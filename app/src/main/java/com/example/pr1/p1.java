package com.example.pr1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pr1.databinding.ActivityP1Binding;

public class p1 extends AppCompatActivity {

    private ActivityP1Binding binding;
    TextView amenities;
    int userId;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");
        binding = ActivityP1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> { finish(); // closes the activity and returns to the previous screen
        });
        // Find views

        amenities=(TextView) findViewById(R.id.txtamenities);
        amenities.setText("City skyline view" + "\n" + "Kitchen" + "\n" + "Wifi" + "\n" + "Dedicated workspace" + "\n" + "Free residential garage on premises" + "\n" + "Private hot tub – available seasonally, open 24 hours" + "\n" + "Pets allowed" + "\n" + "65 inch HDTV" + "Elevator" + "\n"  + "Free washer – In unit");

        // Array of image resource IDs
        int[] images = { R.drawable.l1livingroom1, R.drawable.l1livingroom2, R.drawable.l1kitchen1, R.drawable.l1kitchen4 ,R.drawable.l1kitchen3, R.drawable.l1kitchen4, R.drawable.l1bedroom, R.drawable.l1bedroom2, R.drawable.l1bedroom3, R.drawable.l1bedroom3, R.drawable.l1bedroom4,R.drawable.l1bathroom, R.drawable.l1diningarea1, R.drawable.l1terrace1,  R.drawable.l1terrace2,  R.drawable.l1terrace3, R.drawable.l1terrace4, R.drawable.l1terrace5, R.drawable.l1terrace6, R.drawable.l1terrace7, R.drawable.l1terrace8 };
        // Optional: descriptions for each image
        String[] descriptions = { "Living room", "Living room", "Kitchen","Kitchen","Kitchen","Kitchen","Bedroom","Bedroom","Bedroom","Bedroom","Bedroom","Bathroom","Dining area","Terrace","Terrace","Terrace","Terrace","Terrace","Terrace","Terrace","Terrace"};

        // 👉 FAB listener OUTSIDE scroll listener
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
            Intent intent = new Intent(p1.this, reserve.class);
            intent.putExtra("apartmentName", "Achrafieh Rooftop 1-BR W Jacuzzi");
            intent.putExtra("basePrice", 255); //
            // example base price
            // Pass logged-in user info
            intent.putExtra("user_id", userId);
            intent.putExtra("user_name", userName);

            startActivity(intent);
        });
        Button btnShowmore = findViewById(R.id.btnshowmore);

        btnShowmore.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p1.this, description.class);
            startActivity(intent);
        });
        Button btnShowamenities = findViewById(R.id.btnshowallamenities);

        btnShowamenities.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p1.this, amenities.class);
            startActivity(intent);
        });


    }
    }
