package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities7 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
            finish(); // closes the activity and returns to the previous screen
        });

        txt1 = findViewById(R.id.tv1);
        txt2 = findViewById(R.id.tv2);
        txt3 = findViewById(R.id.tv3);
        txt4 = findViewById(R.id.tv4);
        txt5 = findViewById(R.id.tv5);
        txt6 = findViewById(R.id.tv6);
        txt7 = findViewById(R.id.tv7);
        txt8 = findViewById(R.id.tv8);
        txt9 = findViewById(R.id.tv9);


        txt1.setText(
                "Hot water\n" +
                        "────────────────────────────\n"
        );

        txt2.setText(
                "Washer\n" +
                        "────────────────────────────\n"
        );

        txt3.setText(
                "TV\n" +
                        "────────────────────────────\n"
        );

        txt4.setText(
                "Central heating\n" +
                        "────────────────────────────\n"
        );

        txt5.setText(
                "Carbon monoxide alarm\n" +
                        "────────────────────────────\n" +
                        "Fire extinguisher\n" +
                        "────────────────────────────\n" +
                        "First aid kit\n" +
                        "────────────────────────────\n"
        );

        txt6.setText(
                "Wifi\n" +
                        "────────────────────────────\n" +
                        "Dedicated workspace\n" +
                        "────────────────────────────\n"
        );

        txt7.setText(
                "Kitchen\n" +
                        "────────────────────────────\n" +
                        "Space where guests can cook their own meals\n" +
                        "────────────────────────────\n"
        );

        txt8.setText(
                "Pets allowed\n" +
                        "────────────────────────────\n" +
                        "Assistance animals are always allowed\n" +
                        "────────────────────────────\n" +
                        "Self check-in\n" +
                        "────────────────────────────\n" +
                        "Smart lock\n" +
                        "────────────────────────────\n"
        );

        txt9.setText(
                "Unavailable: Exterior security cameras on property\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Dryer\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Air conditioning\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Essentials\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Smoke alarm\n" +
                        "                        ────────────────────────────\n" +
                        "                        This place may not have a smoke detector." +
                        " Reach out to the host with any questions.\n" +
                        "                        ────────────────────────────\n"
        );



    }
}