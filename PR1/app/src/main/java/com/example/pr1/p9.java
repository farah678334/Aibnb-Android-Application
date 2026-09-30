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

import com.example.pr1.databinding.ActivityP9Binding;

public class p9 extends AppCompatActivity {
    TextView amenities;
    int userId;
    String userName;
    private AppBarConfiguration appBarConfiguration;
    private ActivityP9Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");
        binding = ActivityP9Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
            finish(); // closes the activity and returns to the previous screen
        });
        // Find views

        amenities=(TextView) findViewById(R.id.txtamenities);
        amenities.setText("Beach access\n" +
                "Kitchen\n" +
                "Wifi\n" +
                "Free parking on premises\n" +
                "Pool\n" +
                "Shared sauna\n" +
                "TV\n" +
                "Exterior security cameras on property\n" +
                "Unavailable: Carbon monoxide alarm\n" +
                "Unavailable: Smoke alarm");

        // Array of image resource IDs
        int[] images = { R.drawable.t3livingroom1, R.drawable.t3livingroom2,R.drawable.t3livingroom3,R.drawable.t3livingroom4,R.drawable.t3livingroom5,R.drawable.t3bedroom1,R.drawable.t3bedroom2,R.drawable.t3backyard1,  R.drawable.t3backyard2,R.drawable.t3backyard3,R.drawable.t3backyard4, R.drawable.t3backyard5,R.drawable.t3backyard6,R.drawable.t3backyard7, R.drawable.t3backyard8, R.drawable.t3balcony,R.drawable.t3exterior,R.drawable.t3exterioir2,R.drawable.t3bathroom1,R.drawable.t3bathroom2};
        // Optional: descriptions for each image
        String[] descriptions = { "Living room", "Living room","Living room","Living room","Living room","Bedroom","Bedroom","Backyard","Backyard","Backyard","Backyard","Backyard","Backyard","Backyard","Backyard","Balcony","Exterior","Exterior","Bathroom","Bathroom"};



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
            Intent intent = new Intent(p9.this, reserve.class);
            intent.putExtra("apartmentName", "Charming flat with stunning view");
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
            Intent intent = new Intent(p9.this, description9.class);
            startActivity(intent);
        });
        Button btnShowamenities = findViewById(R.id.btnshowallamenities);

        btnShowamenities.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p9.this, amenities9.class);
            startActivity(intent);
        });
    }


}