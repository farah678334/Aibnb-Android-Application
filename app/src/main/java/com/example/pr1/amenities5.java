package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities5 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities5);
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
        txt11 = findViewById(R.id.tv1);
        txt12 = findViewById(R.id.tv2);

        txt1.setText(
                "Courtyard view\n"
        );

        txt2.setText(
                "Bathtub\n" +"────────────────────────────"+"\n"+
                        "Hair dryer\n" +"────────────────────────────"+"\n"+
                        "Cleaning products\n" +"────────────────────────────"+"\n"+
                        "Shampoo\n" +"────────────────────────────"+"\n"+
                        "Body soap\n" +"────────────────────────────"+"\n"+
                        "Hot water\n"+"────────────────────────────"+"\n"
        );

        txt3.setText(
                "Washer\n" +"────────────────────────────"+"\n"+
                        "Essentials\n" +"────────────────────────────"+"\n"+
                        "Towels, bed sheets, soap, and toilet paper\n" +"────────────────────────────"+"\n"+
                        "Hangers\n" +"────────────────────────────"+"\n"+
                        "Bed linens\n" +"────────────────────────────"+"\n"+
                        "Cotton linens\n" +"────────────────────────────"+"\n"+
                        "Iron\n" +"────────────────────────────"+"\n"+
                        "Drying rack for clothing\n" +"────────────────────────────"+"\n"+
                        "Clothing storage: wardrobe\n"+"────────────────────────────"+"\n"
        );


        txt4.setText(
                "Ethernet connection\n" +"────────────────────────────"+"\n"+
                        "Sound system\n" +"────────────────────────────"+"\n"+
                        "TV\n" +"────────────────────────────"+"\n"+
                        "Sound system\n" +"────────────────────────────"+"\n"+
                        "Books and reading material\n"+"────────────────────────────"+"\n"
        );


        txt5.setText(
                "Pack ’n play / Travel crib\n"+"────────────────────────────"+"\n"
        );


        txt6.setText(
                "Heating\n"+"────────────────────────────"+"\n"
        );


        txt7.setText(
                "Smoke alarm\n"+"────────────────────────────"+"\n"
        );


        txt8.setText(
                "Wifi\n" +"────────────────────────────"+"\n"+
                        "Dedicated workspace\n"+"────────────────────────────"+"\n"
        );


        txt9.setText(
                "Kitchen\n" +"────────────────────────────"+"\n"+
                        "Space where guests can cook their own meals\n" +"────────────────────────────"+"\n"+
                        "Refrigerator\n" +"────────────────────────────"+"\n"+
                        "Microwave\n" +"────────────────────────────"+"\n"+
                        "Cooking basics\n" +"────────────────────────────"+"\n"+
                        "Pots and pans, oil, salt and pepper\n" +"────────────────────────────"+"\n"+
                        "Dishes and silverware\n" +"────────────────────────────"+"\n"+
                        "Bowls, chopsticks, plates, cups, etc.\n" +"────────────────────────────"+"\n"+
                        "Freezer\n" +"────────────────────────────"+"\n"+
                        "Dishwasher\n" +"────────────────────────────"+"\n"+
                        "Stove\n" +"────────────────────────────"+"\n"+
                        "Oven\n" +"────────────────────────────"+"\n"+
                        "Hot water kettle\n" +"────────────────────────────"+"\n"+
                        "Coffee maker\n" +"────────────────────────────"+"\n"+
                        "Wine glasses\n" +"────────────────────────────"+"\n"+
                        "Toaster\n" +"────────────────────────────"+"\n"+
                        "Baking sheet\n" +"────────────────────────────"+"\n"+
                        "Blender\n" +"────────────────────────────"+"\n"+
                        "Dining table\n" +"────────────────────────────"+"\n"+
                        "Coffee\n"+"────────────────────────────"+"\n"
        );

        txt10.setText(
                "Elevator\n" +"────────────────────────────"+"\n"+
                        "The home or building has an elevator that’s at least 52 inches deep and a doorway at least 32 inches wide\n" +"────────────────────────────"+"\n"+
                        "Paid street parking off premises\n" +"────────────────────────────"+"\n"+
                        "Single level home\n" +"────────────────────────────"+"\n"+
                        "No stairs in home\n"+"────────────────────────────"+"\n"
        );


        txt11.setText(
                "Luggage dropoff allowed\n" +"────────────────────────────"+"\n"+
                        "For guests' convenience when they have early arrival or late departure\n" +"────────────────────────────"+"\n"+
                        "Breakfast\n" +"────────────────────────────"+"\n"+
                        "Breakfast is provided\n" +"────────────────────────────"+"\n"+
                        "Cleaning available during stay\n"+"────────────────────────────"+"\n"
        );


        txt12.setText(
                "Unavailable: Exterior security cameras on property\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Dryer\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Air conditioning\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Carbon monoxide alarm\n" +"────────────────────────────"+"\n"+
                        "Host has indicated no carbon monoxide detector is necessary. Reach out to the host with any questions.\n"+"────────────────────────────"+"\n"
        );

    }
}