package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities8 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities8);
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
                "Courtyard view\n"  +"────────────────────────────"+"\n"
        );

        txt2.setText(
                "Hair dryer\n" +"────────────────────────────"+"\n"+
                        "Cleaning products\n" +"────────────────────────────"+"\n"+
                        "Shampoo\n" +"────────────────────────────"+"\n"+
                        "Bidet\n" +"────────────────────────────"+"\n"+
                        "Hot water\n" +"────────────────────────────"+"\n"+
                        "Shower gel"+"────────────────────────────"+"\n" );

        txt3.setText(
                "Free washer – In unit\n" +"────────────────────────────"+"\n"+
                        "Essentials\n" +"────────────────────────────"+"\n"+
                        "Towels, bed sheets, soap, and toilet paper\n" +"────────────────────────────"+"\n"+
                        "Hangers\n" +"────────────────────────────"+"\n"+
                        "Bed linens\n" +"────────────────────────────"+"\n"+
                        "Cotton linens\n" +"────────────────────────────"+"\n"+
                        "Extra pillows and blankets\n" +"────────────────────────────"+"\n"+
                        "Room-darkening shades\n" +"────────────────────────────"+"\n"+
                        "Iron\n" +"────────────────────────────"+"\n"+
                        "Drying rack for clothing\n" +"────────────────────────────"+"\n"+
                        "Safe\n" +"────────────────────────────"+"\n"+
                        "Clothing storage: wardrobe"+"────────────────────────────"+"\n"  );

        txt4.setText("50 inch HDTV with Amazon Prime Video, Chromecast, Disney+, Netflix\n" +"────────────────────────────"+"\n"+
                "Books and reading material" +"────────────────────────────"+"\n");








        txt5.setText("Pack ’n play/Travel crib - available upon request\n" +
                "Children’s books and toys\n" +
                "High chair"  );

        txt6.setText("AC - split type ductless system\n" +
                "Radiant heating"  );

        txt7.setText("Fast wifi – 130 Mbps\n" +
                "Verified by speed test. Stream 4K videos and join video calls on multiple devices."  );

        txt8.setText("Kitchen\n" +
                "Space where guests can cook their own meals\n" +
                "Teka refrigerator\n" +
                "Cooking basics\n" +
                "Pots and pans, oil, salt and pepper\n" +
                "Dishes and silverware\n" +
                "Bowls, chopsticks, plates, cups, etc." );

        txt9.setText(
                "Teka electric stove\n" +
                        "Hot water kettle\n" +
                        "Coffee maker: Nespresso\n" +
                        "Toaster\n" +
                        "Dining table\n" +
                        "Coffee" );

        txt10.setText(
                "Private patio or balcony\n" +
                        "Private backyard – Not fully fenced\n" +
                        "An open space on the property usually covered in grass\n" +
                        "Outdoor furniture\n" +
                        "Outdoor dining area" );


        txt10.setText(
                "Free street parking\n" +
                        "Paid parking lot off premises\n" +
                        "Paid parking on premises" );


        txt10.setText(
                "Luggage dropoff allowed\n" +
                        "For guests' convenience when they have early arrival or late departure\n" +
                        "Long term stays allowed\n" +
                        "Allow stay for 28 days or more\n" +
                        "Self check-in\n" +
                        "Keypad\n" +
                        "Check yourself into the home with a door code\n" +
                        "Cleaning available during stay" );


        txt10.setText(
                "Unavailable: Exterior security cameras on property\n" +
                        "Unavailable: Dryer\n" +
                        "Unavailable: Smoke alarm\n" +
                        "There is no smoke alarm on the property.\n" +
                        "Unavailable: Carbon monoxide alarm\n" +
                        "There is no carbon monoxide detector on the property." );


    }


}