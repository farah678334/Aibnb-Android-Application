package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class amenities6 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amenities6);
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

        txt1.setText(
                "Hair dryer\n" +"────────────────────────────"+"\n"+
                        "Hot water"+"────────────────────────────"+"\n"
        );

        txt2.setText(
                "Washer\n" +"────────────────────────────"+"\n"+
                        "Essentials\n" +"────────────────────────────"+"\n"+
                        "Towels, bed sheets, soap, and toilet paper\n" +"────────────────────────────"+"\n"+
                        "Iron\n" +"────────────────────────────"+"\n"+
                        "Clothing storage"+"────────────────────────────"+"\n"
        );

        txt3.setText(
                "Central heating" +"────────────────────────────"+"\n"+
                        "Cotton linens\n" +"────────────────────────────"+"\n"+
                        "Iron\n" +"────────────────────────────"+"\n"+
                        "Drying rack for clothing\n" +"────────────────────────────"+"\n"+
                        "Clothing storage: wardrobe\n"+"────────────────────────────"+"\n"
        );


        txt4.setText(
                "Wifi"+"────────────────────────────"+"\n"
        );


        txt5.setText(
                "Kitchen\n" +"────────────────────────────"+"\n"+
                        "Space where guests can cook their own meals\n" +"────────────────────────────"+"\n"+
                        "Refrigerator\n" +"────────────────────────────"+"\n"+
                        "Cooking basics\n" +"────────────────────────────"+"\n"+
                        "Pots and pans, oil, salt and pepper\n" +"────────────────────────────"+"\n"+
                        "Dishes and silverware\n" +"────────────────────────────"+"\n"+
                        "Bowls, chopsticks, plates, cups, etc.\n" +"────────────────────────────"+"\n"+
                        "Toaster\n" +"────────────────────────────"+"\n"+
                        "Dining table"+"────────────────────────────"+"\n"
        );


        txt6.setText(
                "Host greets you"+"────────────────────────────"+"\n"
        );


        txt7.setText(
                "Unavailable: Exterior security cameras on property\n" +"────────────────────────────"+"\n"+
                        "Unavailable: TV\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Dryer\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Air conditioning\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Smoke alarm\n" +"────────────────────────────"+"\n"+
                        "This place may not have a smoke detector. Reach out to the host with any questions.\n" +"────────────────────────────"+"\n"+
                        "Unavailable: Carbon monoxide alarm\n" +"────────────────────────────"+"\n"+
                        "This place may not have a carbon monoxide detector. Reach out to the host with any questions."+"────────────────────────────"+"\n"
        );


    }
}