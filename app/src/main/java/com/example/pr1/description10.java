package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description10 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description10);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> {
            finish(); // closes the activity and returns to the previous screen
        });
        txtDescription = findViewById(R.id.tv1);
        txtDescription.setText(
                "About this space\n" +
                        "airloft room with terrace in a 3+1 house on 4 th floors without elevator, in the city center, very close to Vista Plaza building (old Antalya 2000), hadrianus gate (kalekapısı- kaleiçi) oldtown and Antalya high school. The living room, kitchen and bathroom are shared.\n" +
                        "\n" +
                        "The space\n" +
                        "The house is on the 4th floor in a building without elevator. three rooms, one living room, totaly 240 square meters duplex; On the lower floor there is a room (cozy room) of 20 square meters with own bathroom&wc, kitchen, common wc toilet and its own bathroom.\n" +
                        "On the upper floor there are 2 attic rooms each 20 square meter with their own terraces (average 40 square meters) and the house has a shared bathroom (for these two rooms).\n" +
                        "If desired, you can use the chain-locked parking area of \u200B\u200Bthe building.\n" +
                        "\n" +
                        "Guest access\n" +
                        "Your room and its terrace are private to you. Common areas at home; It will be used with other Airbnb guests. Living room, kitchen and bathroom.\n" +
                        "\n" +
                        "Other things to note\n" +
                        "Common areas at home; It will be used with other Airbnb guests. Living room, kitchen and bathroom.\n" +
                        "\n" +
                        "Registration Details\n" +
                        "07-2781");

    }
}