package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities extends AppCompatActivity {
TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities);
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
        txt10 = findViewById(R.id.tv10);
        txt1.setText(
                "Hair dryer\n"  +"────────────────────────────"+"\n"+
                "Cleaning products\n" +"────────────────────────────"+"\n"+
                "Shampoo\n" +"────────────────────────────"+"\n"+
                "Body soap\n" +"────────────────────────────"+"\n"+
                "Hot water\n" +"────────────────────────────"+"\n"+
                "Shower gel\n" +"────────────────────────────"+"\n" );

        txt2.setText(
                "Free washer – In unit\n" +"────────────────────────────"+"\n"+
                "Essentials (towels, sheets, soap, toilet paper)\n" +"────────────────────────────"+"\n"+
                "Hangers\n" +"────────────────────────────"+"\n"+
                "Bed linens / Cotton linens\n" +"────────────────────────────"+"\n"+
                "Extra pillows and blankets\n" +"────────────────────────────"+"\n"+
                "Room-darkening shades\n" +"────────────────────────────"+"\n"+
                "Iron\n" +"────────────────────────────"+"\n"+
                "Drying rack for clothing\n" +"────────────────────────────"+"\n"+
                "Safe\n" +"────────────────────────────"+"\n"+
                "Mosquito net\n" +"────────────────────────────"+"\n"+
                "Clothing storage: closet\n"
                        +"────────────────────────────"+"\n"  );

        txt3.setText(
                "Ethernet connection\n" +"────────────────────────────"+"\n"+
                "65 inch HDTV\n"+"────────────────────────────"+"\n"  );

        txt4.setText("Crib\n" +"────────────────────────────"+"\n"+
                "High chair\n" +"────────────────────────────"+"\n" );

        txt5.setText("Window AC unit\n" +"────────────────────────────"+"\n"+
                "Split type ductless AC\n" +"────────────────────────────"+"\n"+
                "Central heating\n"+"────────────────────────────"+"\n"  );

        txt6.setText("Smoke alarm\n" +"────────────────────────────"+"\n"+
                "Carbon monoxide alarm\n"+"────────────────────────────"+"\n"  );

        txt7.setText("Wifi\n" +"────────────────────────────"+"\n"+
                "Dedicated workspace\n"+"────────────────────────────"+"\n"  );

        txt8.setText("Kitchen\n" +"────────────────────────────"+"\n"+
                "Refrigerator / Freezer\n" +"────────────────────────────"+"\n"+
                "Microwave\n" +"────────────────────────────"+"\n"+
                "Cooking basics\n" +"────────────────────────────"+"\n"+
                "Dishes and silverware\n" +"────────────────────────────"+"\n"+
                "Electric stove\n" +"────────────────────────────"+"\n"+
                "Coffee maker: espresso machine\n" +"────────────────────────────"+"\n"+
                "Wine glasses\n" +"────────────────────────────"+"\n"+
                "Dining table\n" +"────────────────────────────"+"\n" );

        txt9.setText(
                "Private entrance\n" +"────────────────────────────"+"\n"+
                "Separate street or building entrance\n" +"────────────────────────────"+"\n"+
                "Laundromat nearby\n" +"────────────────────────────"+"\n" );

        txt10.setText(
                "Private patio or balcony\n" +"────────────────────────────"+"\n"+
                "Outdoor dining area\n" +"────────────────────────────"+"\n"+
                "Parking and facilities\n" +"────────────────────────────"+"\n"+
                "Free residential garage on premises\n" +"────────────────────────────"+"\n"+
                "Free street parking\n" +"────────────────────────────"+"\n"+
                "Private hot tub – seasonal\n" +"────────────────────────────"+"\n"+
                "Elevator (52\" deep, 32\" doorway)\n" +"────────────────────────────"+"\n"+
                "Services\n" +"────────────────────────────"+"\n"+
                "Pets allowed\n" +"────────────────────────────"+"\n"+
                "Assistance animals always allowed\n" +"────────────────────────────"+"\n"+
                "Self check-in\n" +"────────────────────────────"+"\n"+
                "Smart lock\n"+"────────────────────────────"+"\n" );
    }
}