package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities3 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities3);
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
                "Hair dryer\n" + "────────────────────────────"+"\n"+
                        "Shampoo\n"  +"────────────────────────────"+"\n"+
                        "Hot water\n"  +"────────────────────────────"+"\n"+
                        "Shower gel\n" +"────────────────────────────"+"\n"
        );

        txt2.setText(
                "Washer\n" +"────────────────────────────"+"\n"+
                        "Essentials\n" +"────────────────────────────"+"\n"+
                        "Towels, bed sheets, soap, and toilet paper\n" +"────────────────────────────"+"\n"+
                        "Hangers\n" +"────────────────────────────"+"\n"+
                        "Bed linens\n" +"────────────────────────────"+"\n"+
                        "Room-darkening shades\n" +"────────────────────────────"+"\n"+
                        "Drying rack for clothing\n" +"────────────────────────────"+"\n"+
                        "Clothing storage\n"+"────────────────────────────"+"\n"
        );

        txt3.setText(
                "TV\n"+"────────────────────────────"+"\n"
        );

        txt4.setText(
                "Crib\n"+"────────────────────────────"+"\n"
        );

        txt5.setText(
                "AC - split type ductless system\n" +"────────────────────────────"+"\n"+
                        "Heating\n"+"────────────────────────────"+"\n"
        );

        txt6.setText(
                "Fire extinguisher\n"+"────────────────────────────"+"\n"
        );

        txt7.setText(
                "Wifi\n"+"────────────────────────────"+"\n"
        );

        txt8.setText(
                "Kitchen\n" +"────────────────────────────"+"\n"+
                        "Space where guests can cook their own meals\n" +"────────────────────────────"+"\n"+
                        "Microwave\n" +"────────────────────────────"+"\n"+
                        "Cooking basics\n" +"────────────────────────────"+"\n"+
                        "Pots and pans, oil, salt and pepper\n" +"────────────────────────────"+"\n"+
                        "Dishes and silverware\n" +"────────────────────────────"+"\n"+
                        "Bowls, chopsticks, plates, cups, etc.\n" +"────────────────────────────"+"\n"+
                        "Mini fridge\n" +"────────────────────────────"+"\n"+
                        "Electric stove\n" +"────────────────────────────"+"\n"+
                        "Oven\n" +"────────────────────────────"+"\n"+
                        "Wine glasses\n"+"────────────────────────────"+"\n"
        );

        txt9.setText(
                "Shared beach access\n" +"────────────────────────────"+"\n"+
                        "Guests can enjoy a nearby beach\n"+"────────────────────────────"+"\n"
        );

        txt10.setText(
                "Free parking on premises\n" +"────────────────────────────"+"\n"+
                        "Free street parking\n" +"────────────────────────────"+"\n"+
                        "Luggage dropoff allowed\n" +"────────────────────────────"+"\n"+
                        "Long term stays allowed\n" +"────────────────────────────"+"\n"+
                        "Self check-in\n" +"────────────────────────────"+"\n"+
                        "Lockbox\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Smoke alarm\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Carbon monoxide alarm\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Private entrance\n"+"────────────────────────────"+"\n"
        );



    }
}