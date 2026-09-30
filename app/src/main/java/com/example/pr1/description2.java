package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description2 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> { finish(); // closes the activity and returns to the previous screen
        });
        txtDescription=findViewById(R.id.tv1);
        txtDescription.setText(
                "About this space\n" +
                        "Welcome to Mood by Stayinn!\n" +
                        "An apartment that embodies the vibes of Gemmayze!\n" +
                        "\n" +
                        "Take a stroll through the St. Nicolas steps or indulge yourself in exquisite meals of your choice.\n" +
                        "\n" +
                        "Wake up to the smell of freshly baked bread and pastries, sip your morning coffee at one of the many café trottoirs with your beloved one, finish off your day in one of the pubs for happy hour or dance along with your friends at night.\n" +
                        "\n" +
                        "\n" +
                        "The space\n" +
                        "This apartment is perfect for families and friends and consists of:\n" +
                        "- 24/7 Electricity\n" +
                        "- Fast fiber Internet\n" +
                        "- One bedroom with a king-sized bed, and Smart TV.\n" +
                        "- One full bathroom\n" +
                        "- A fully equipped kitchen\n" +
                        "- A comfy living room with a smart TV\n" +
                        "\n" +
                        "Guest access\n" +
                        "Guests have access to the entire apartment, amenities, and all facilities. These include a washing machine.\n" +
                        "The apartment is located on the 9th floor, the elevator is ON 24/7.\n" +
                        "\n" +
                        "Other things to note\n" +
                        " Reservation Policy: No changes or alterations to reservations are allowed within 72 hours of check-in.\n" +
                        " Photoshoots & Gatherings: Must be approved in advance. Unauthorized gatherings or commercial shoots will incur a penalty.\n" +
                        "Security Requirement: Passport copies are required upon reservation per Lebanese General Security.\n" +
                        " Mid-stay Cleaning: Available upon request for an additional fee." );





    }
}