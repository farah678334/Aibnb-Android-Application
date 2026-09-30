package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description5 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description5);
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
                        "Beautiful Parisian apartment of 100 m2 on the 4th floor with an elevator. Located in a typical neighborhood and a small quiet street close to Montparnasse. Traditional apartment (parquet, ceiling moldings) and comfortable. Close to the metro and many buses to visit the center. Located in a shopping area with lots of restaurants.\n" +
                        "\n" +
                        "The space\n" +
                        "Beautiful Parisian apartment with an elevator, on a small quiet street near shops and restaurants. It is located 20 minutes by bus from the Eiffel Tower and it is very easy to get to the center of Paris by metro. This apartment is 2 metro stops from Porte de Versailles where there are lots of trade shows.\n" +
                        "\n" +
                        "Guest access\n" +
                        "Guests have access to all central rooms: a bedroom, a living room, a dining room, a kitchen and a bathroom, with the exception of a small bedroom and a closet.\n" +
                        "\n" +
                        "Registration Details\n" +
                        "7511504196111");

    }
}