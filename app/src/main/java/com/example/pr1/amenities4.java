package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities4 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities4);
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
        txt11 = findViewById(R.id.tv21);






        txt1.setText(
                "Bathtub\n"  +"────────────────────────────"+"\n"+
                        "Hair dryer\n"  +"────────────────────────────"+"\n"+
                        "Cleaning products\n"  +"────────────────────────────"+"\n"+
                        "Shampoo\n"  +"────────────────────────────"+"\n"+
                        "Body soap\n"  +"────────────────────────────"+"\n"+
                        "Hot water\n"  +"────────────────────────────"+"\n"+
                        "Shower gel\n"+"────────────────────────────"+"\n"
        );


        txt2.setText(
                "Essentials\n" +"────────────────────────────"+"\n"+
                        "Towels, bed sheets, soap, and toilet paper\n" +"────────────────────────────"+"\n"+
                        "Hangers\n" +"────────────────────────────"+"\n"+
                        "Bed linens\n" +"────────────────────────────"+"\n"+
                        "Egyptian cotton linens\n" +"────────────────────────────"+"\n"+
                        "Room-darkening shades\n" +"────────────────────────────"+"\n"+
                        "Iron\n" +"────────────────────────────"+"\n"+
                        "Mosquito net\n" +"────────────────────────────"+"\n"+
                        "Clothing storage\n"+"────────────────────────────"+"\n"
        );


        txt3.setText(
                "Ethernet connection\n" +"────────────────────────────"+"\n"+
                        "TV\n"+"────────────────────────────"+"\n"
        );


        txt4.setText(
                "Children’s books and toys for ages 10+ years old\n" +"────────────────────────────"+"\n"+
                        "High chair\n" +"────────────────────────────"+"\n"+
                        "Window guards\n"+"────────────────────────────"+"\n"
        );


        txt5.setText(
                "Air conditioning\n" +"────────────────────────────"+"\n"+
                        "Heating\n"+"────────────────────────────"+"\n"
        );


        txt6.setText(
                "Wifi\n" +"────────────────────────────"+"\n"+
                        "Dedicated workspace\n"+"────────────────────────────"+"\n"
        );


        txt7.setText(
                "Kitchen\n" +"────────────────────────────"+"\n"+
                        "Space where guests can cook their own meals\n" +"────────────────────────────"+"\n"+
                        "Refrigerator\n" +"────────────────────────────"+"\n"+
                        "Microwave\n" +"────────────────────────────"+"\n"+
                        "Cooking basics\n" +"────────────────────────────"+"\n"+
                        "Pots and pans, oil, salt and pepper\n" +"────────────────────────────"+"\n"+
                        "Dishes and silverware\n" +"────────────────────────────"+"\n"+
                        "Bowls, chopsticks, plates, cups, etc.\n" +"────────────────────────────"+"\n"+
                        "Mini fridge\n" +"────────────────────────────"+"\n"+
                        "Freezer\n" +"────────────────────────────"+"\n"+
                        "Stainless steel stove\n" +"────────────────────────────"+"\n"+
                        "Hot water kettle\n" +"────────────────────────────"+"\n"+
                        "Coffee maker\n" +"────────────────────────────"+"\n"+
                        "Wine glasses\n" +"────────────────────────────"+"\n"+
                        "Trash compactor\n"+"────────────────────────────"+"\n"
        );


        txt8.setText(
                "Beach access\n" +"────────────────────────────"+"\n"+
                        "Guests can enjoy a nearby beach\n"+"────────────────────────────"+"\n"
        );


        txt9.setText(
                "Free parking on premises\n" +"────────────────────────────"+"\n"+
                        "Elevator\n" +"────────────────────────────"+"\n"+
                        "The home or building has an elevator that’s at least 52 inches deep and a doorway at least 32 inches wide\n"+"────────────────────────────"+"\n"
        );


        txt10.setText(
                "Smoking allowed\n" +"────────────────────────────"+"\n"+
                        "Long term stays allowed\n" +"────────────────────────────"+"\n"+
                        "Allow stay for 28 days or more\n" +"────────────────────────────"+"\n"+
                        "Self check-in\n" +"────────────────────────────"+"\n"+
                        "Lockbox\n"+"────────────────────────────"+"\n"
        );


        txt11.setText(
                "Unavailable: Washer\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Smoke alarm\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Carbon monoxide alarm\n" +"────────────────────────────"+"\n"+
                        "This place may not have a smoke detector. Reach out to the host with any questions.\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Private entrance\n" +"────────────────────────────"+"\n"+
                        "This place may not have a carbon monoxide detector. Reach out to the host with any questions.\n"+"────────────────────────────"+"\n"
        );

    }


}