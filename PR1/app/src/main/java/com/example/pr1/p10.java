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

import com.example.pr1.databinding.ActivityP10Binding;

public class p10 extends AppCompatActivity {
    TextView amenities;
    int userId;
    String userName;
    private AppBarConfiguration appBarConfiguration;
    private ActivityP10Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");
        binding = ActivityP10Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
            finish(); // closes the activity and returns to the previous screen
        });
        // Find views

        amenities=(TextView) findViewById(R.id.txtamenities);
        amenities.setText("\n" +
                "Kitchen\n" +
                "Wifi\n" +
                "Dedicated workspace\n" +
                "Free parking on premises\n" +
                "TV\n" +
                "Washer\n" +
                "Air conditioning\n" +
                "Indoor fireplace\n" +
                "Hair dryer\n" +
                "Refrigerator");

        // Array of image resource IDs
        int[] images = { R.drawable.t4livingroom1, R.drawable.t4livingroom2,R.drawable.t4livingroom3,R.drawable.t4livingroom4,R.drawable.t4bedroom1,R.drawable.t4bedroom2,R.drawable.t4bedroom3, R.drawable.t4bedroom4,R.drawable.t4bedroom5,R.drawable.t4bedroom6,R.drawable.t4bedroom7,R.drawable.t4bedroom8,R.drawable.t4additional1,R.drawable.t4additional2,R.drawable.t4additional3,R.drawable.t4additional4,R.drawable.t4exterior1,R.drawable.t4exterior2,R.drawable.t4exterior3,R.drawable.t4exterior4,R.drawable.t4exterior5,R.drawable.t4kitchen1,R.drawable.t4kitchen2,R.drawable.t4kitchen3,R.drawable.t4bathroom1,R.drawable.t4bathroom2,R.drawable.t4bathroom3,R.drawable.t4bathroom4};
        // Optional: descriptions for each image
        String[] descriptions = { "Living room", "Living room","Living room","Living room","Bedroom","Bedroom","Bedroom","Bedroom","Bedroom","Bedroom","Bedroom","Bedroom","Additional","Additional","Additional","Additional","Exterior","Exterior","Exterior","Exterior","Exterior","Kitchen","Kitchen","Kitchen","Bathroom","Bathroom","Bathroom","Bathroom"};



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
            Intent intent = new Intent(p10.this, reserve.class);
            intent.putExtra("apartmentName", "07 Superb Terrace, Heart of Cihangir, fibernet");
            intent.putExtra("basePrice", 155); //
            // example base price
            // Pass logged-in user info
            intent.putExtra("user_id", userId);
            intent.putExtra("user_name", userName);

            startActivity(intent);
        });
        Button btnShowmore = findViewById(R.id.btnshowmore);

        btnShowmore.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p10.this, description10.class);
            startActivity(intent);
        });
        Button btnShowamenities = findViewById(R.id.btnshowallamenities);

        btnShowamenities.setOnClickListener(v -> {
            // Example: open ReserveActivity
            Intent intent = new Intent(p10.this, amenities10.class);
            startActivity(intent);
        });
    }


}