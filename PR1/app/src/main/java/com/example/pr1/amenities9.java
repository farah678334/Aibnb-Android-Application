package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities9 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities9);
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
                        "Cleaning products\n" +
                        "────────────────────────────\n" +
                        "Shampoo\n" +
                        "────────────────────────────\n" +
                        "Outdoor shower\n" +
                        "────────────────────────────\n" +
                        "Hot water\n"
        );

        txt2.setText(
                "Washer\n" +
                        "────────────────────────────\n" +
                        "Essentials\n" +
                        "────────────────────────────\n" +
                        "Towels, bed sheets, soap, and toilet paper\n" +
                        "────────────────────────────\n" +
                        "Hangers\n" +
                        "────────────────────────────\n" +
                        "Bed linens\n" +
                        "────────────────────────────\n" +
                        "Extra pillows and blankets\n" +
                        "────────────────────────────\n" +
                        "Room-darkening shades\n" +
                        "────────────────────────────\n" +
                        "Iron\n" +
                        "────────────────────────────\n" +
                        "Drying rack for clothing\n" +
                        "────────────────────────────\n" +
                        "Clothing storage: closet\n"
        );

        txt3.setText(
                "TV\n" +
                        "────────────────────────────\n" +
                        "Exercise equipment\n" +
                        "────────────────────────────\n" +
                        "Books and reading material\n"
        );

        txt4.setText(
                "Outdoor playground\n" +
                        "────────────────────────────\n" +
                        "An outdoor area equipped with play structures for children\n"
        );

        txt5.setText(
                "Air conditioning\n" +
                        "────────────────────────────\n" +
                        "Central heating\n"
        );

        txt6.setText(
                "Exterior security cameras on property\n" +
                        "────────────────────────────\n" +
                        "There are security cameras outside the building.\n"
        );

        txt7.setText(
                "Wifi\n"
        );

        txt8.setText(
                "Kitchen\n" +
                        "────────────────────────────\n" +
                        "Space where guests can cook their own meals\n" +
                        "────────────────────────────\n" +
                        "Refrigerator\n" +
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
                        "Other stove\n" +
                        "────────────────────────────\n" +
                        "Oven\n" +
                        "────────────────────────────\n" +
                        "Hot water kettle\n" +
                        "────────────────────────────\n" +
                        "Dining table\n"
        );

        txt9.setText(
                "Beach access\n" +
                        "────────────────────────────\n" +
                        "Guests can enjoy a nearby beach\n" +
                        "────────────────────────────\n" +
                        "Private entrance\n" +
                        "────────────────────────────\n" +
                        "Separate street or building entrance\n" +
                        "────────────────────────────\n" +
                        "Shared backyard – Fully fenced\n" +
                        "────────────────────────────\n" +
                        "An open space on the property usually covered in grass\n" +
                        "────────────────────────────\n" +
                        "Outdoor furniture\n" +
                        "────────────────────────────\n" +
                        "Outdoor dining area\n"
        );

        txt10.setText(
                "Free parking on premises\n" +
                        "────────────────────────────\n" +
                        "Free street parking\n" +
                        "────────────────────────────\n" +
                        "Pool\n" +
                        "────────────────────────────\n" +
                        "Shared sauna\n" +
                        "────────────────────────────\n" +
                        "Elevator\n" +
                        "────────────────────────────\n" +
                        "The home or building has an elevator that’s at least 52 inches deep and a doorway at least 32 inches wide\n" +
                        "────────────────────────────\n" +
                        "Shared gym in building\n" +
                        "────────────────────────────\n" );


        txt11.setText(   "Unavailable: Dryer\n" +
                "────────────────────────────\n" +
                "Unavailable: Smoke alarm\n" +
                "────────────────────────────\n" +
                "This place may not have a smoke detector. Reach out to the host with any questions.\n" +
                "────────────────────────────\n" +
                "Unavailable: Carbon monoxide alarm\n" +
                "────────────────────────────\n" +
                "This place may not have a carbon monoxide detector. Reach out to the host with any questions.\n"
        );

    }
}