package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities10 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities10);
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
        txt11 = findViewById(R.id.tv11);


        txt1.setText(
                "Hair dryer\n" +
                        "────────────────────────────\n" +
                        "Shampoo\n" +
                        "────────────────────────────\n" +
                        "Conditioner\n" +
                        "────────────────────────────\n" +
                        "Body soap\n" +
                        "────────────────────────────\n" +
                        "Hot water\n" +
                        "────────────────────────────\n" +
                        "Shower gel\n"
        );

        txt2.setText(
                "Washer\n" +
                        "────────────────────────────\n" +
                        "Hangers\n" +
                        "────────────────────────────\n" +
                        "Bed linens\n" +
                        "────────────────────────────\n" +
                        "Extra pillows and blankets\n" +
                        "────────────────────────────\n" +
                        "Iron\n" +
                        "────────────────────────────\n" +
                        "Clothing storage\n"
        );

        txt3.setText(
                "TV\n" +
                        "────────────────────────────\n" +
                        "Game console\n" +
                        "────────────────────────────\n" +
                        "Books and reading material\n"
        );

        txt4.setText(
                "Fireplace guards\n"
        );

        txt5.setText(
                "Air conditioning\n" +
                        "────────────────────────────\n" +
                        "Indoor fireplace\n" +
                        "────────────────────────────\n" +
                        "Heating\n"
        );

        txt6.setText(
                "Smoke alarm\n" +
                        "────────────────────────────\n" +
                        "Carbon monoxide alarm\n" +
                        "────────────────────────────\n" +
                        "Fire extinguisher\n" +
                        "────────────────────────────\n" +
                        "First aid kit\n"
        );

        txt7.setText(
                "Wifi\n" +
                        "────────────────────────────\n" +
                        "Dedicated workspace\n"
        );

        txt8.setText(
                "Kitchen Space where guests can cook their own meals\n" +
                        "────────────────────────────\n" +
                        "Refrigerator\n" +
                        "────────────────────────────\n" +
                        "Microwave\n" +
                        "────────────────────────────\n" +
                        "Cooking basics\n" +
                        "────────────────────────────\n" +
                        "Pots and pans, oil, salt and pepper\n" +
                        "────────────────────────────\n" +
                        "Dishes and silverware\n" +
                        "────────────────────────────\n" +
                        "Bowls, chopsticks, plates, cups, etc.\n" +
                        "────────────────────────────\n" +
                        "Dishwasher\n" +
                        "────────────────────────────\n" +
                        "Stove\n" +
                        "────────────────────────────\n" +
                        "Oven\n" +
                        "────────────────────────────\n" +
                        "Hot water kettle\n" +
                        "────────────────────────────\n" +
                        "Wine glasses\n" +
                        "────────────────────────────\n" +
                        "Baking sheet\n" +
                        "────────────────────────────\n" +
                        "Barbecue utensils\n" +
                        "────────────────────────────\n" +
                        "Grill, charcoal, bamboo skewers/iron skewers, etc.\n" +
                        "────────────────────────────\n" +
                        "Dining table\n" +
                        "────────────────────────────\n" +
                        "Coffee\n"
        );

        txt9.setText(
                "Outdoor furniture\n" +
                        "────────────────────────────\n" +
                        "Outdoor dining area\n" +
                        "────────────────────────────\n" +
                        "BBQ grill\n"
        );

        txt10.setText(
                "Free parking on premises\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Exterior security cameras on property\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Dryer\n" +
                        "────────────────────────────\n" +
                        "Unavailable: Essentials\n"
        );

    }
}