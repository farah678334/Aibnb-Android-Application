package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities2 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
            finish(); // closes the activity and returns to the previous screen
        });
        txt1 = findViewById(R.id.tv11);
        txt2 = findViewById(R.id.tv12);
        txt3 = findViewById(R.id.tv13);
        txt4 = findViewById(R.id.tv14);
        txt5 = findViewById(R.id.tv15);
        txt6 = findViewById(R.id.tv16);
        txt7 = findViewById(R.id.tv17);
        txt8 = findViewById(R.id.tv18);
        txt9 = findViewById(R.id.tv19);
        txt10 = findViewById(R.id.tv20);
        txt1.setText(
                "Bathroom\n" +
                        "────────────────────────────\n" +
                        "Hot water\n" +"────────────────────────────"+"\n"
        );

        txt2.setText(
                "Bedroom and laundry\n" +
                        "────────────────────────────\n" +
                        "Washer\n" +"────────────────────────────"+"\n"
        );

        txt3.setText(
                "Entertainment\n" +
                        "────────────────────────────\n" +
                        "TV\n" +"────────────────────────────"+"\n"
        );

        txt4.setText(
                "Heating and cooling\n" +
                        "────────────────────────────\n" +
                        "Central heating\n" +"────────────────────────────"+"\n"
        );

        txt5.setText(
                "Home safety\n" +
                        "────────────────────────────\n" +
                        "Carbon monoxide alarm\n" + "────────────────────────────"+"\n"+
                        "Fire extinguisher\n"  +"────────────────────────────"+"\n"+
                        "First aid kit\n" +"────────────────────────────"+"\n"
        );

        txt6.setText(
                "Internet and office\n" +
                        "────────────────────────────\n" +
                        "Wifi\n"  +"────────────────────────────"+"\n"+
                        "Dedicated workspace\n" +"────────────────────────────"+"\n"
        );

        txt7.setText(
                "Kitchen and dining\n" +
                        "────────────────────────────\n" +
                        "Kitchen\n"  +"────────────────────────────"+"\n"+
                        "Space where guests can cook their own meals\n" +"────────────────────────────"+"\n"
        );

        txt8.setText(
                "Services\n" +
                        "────────────────────────────\n" +
                        "Pets allowed\n"  +"────────────────────────────"+"\n"+
                        "Assistance animals are always allowed\n"  +"────────────────────────────"+"\n"+
                        "Self check-in\n"  +"────────────────────────────"+"\n"+
                        "Smart lock\n" +"────────────────────────────"+"\n"
        );

        txt9.setText(
                "Not included\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Exterior security cameras on property\n"  +"────────────────────────────"+"\n"+
                        "Unavailable: Dryer\n"  +"────────────────────────────"+"\n"+
                        "Unavailable: Air conditioning\n"  +"────────────────────────────"+"\n"+
                        "Unavailable: Essentials\n" +"────────────────────────────"+"\n"
        );

        txt10.setText(
                "Important information\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Smoke alarm\n"  +"────────────────────────────"+"\n"+
                        "This place may not have a smoke detector.\n"  +"────────────────────────────"+"\n"+
                        "Reach out to the host with any questions.\n" +"────────────────────────────"+"\n"
        );


    }
}