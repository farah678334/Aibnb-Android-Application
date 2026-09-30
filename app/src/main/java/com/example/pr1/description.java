package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description extends AppCompatActivity {
    TextView txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description);
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
                "About this space" +
                        "Welcome to this modern, industrial one-bedroom flat situated in Achrafieh, where you can wander around the area and then sip your freshly brewed cup of coffee in one of the cafes down the street.\n" +
                        "\n" +
                        "A copy of the passport is required upon check-in. Please be advised that the rooftop and the Jacuzzi have no ceiling thus they can't be used during rainy weather.\n" +
                        "\n" +
                        "The space\n" +
                        "Jacuzzi and terrace\n" +
                        "A naturally lit, vivid living room with a comfortable couch and a smart TV\n" +
                        "A fully equipped open kitchen with all the cooking tools\n" +
                        "A bright lit bedroom with a king-size bed\n" +
                        "A full bathroom\n" +
                        "Guest access\n" +
                        "Enjoy our self check-in process hassle-free.\n" +
                        "\nOther things to note\n" +
                        "note\n" +
                        " Reservation Policy: No changes or alterations to reservations are allowed within 72 hours of check-in.\n" +
                        " Photoshoots & Gatherings: Must be approved in advance. Unauthorized gatherings or commercial shoots will incur a penalty.\n" +
                        " Security Requirement: Passport copies are required upon reservation per Lebanese General Security.\n" +
                        " Mid-stay Cleaning: Available upon request for an additional fee.\n" );




    }

}