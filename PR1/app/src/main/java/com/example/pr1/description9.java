package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description9 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description9);
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
                        "Our apartment is only 80 m from Cleopatra Beach, in a new complex with hotel-style facilities. Almost unused and very clean, it offers a peaceful yet central location. Equipped with all essentials: kitchenware, iron, washing machine, unlimited Wi-Fi. The complex includes an outdoor pool, children’s pool, sauna, indoor pool, Turkish bath, and cafeteria.\n" +
                        "Note: facilities operate seasonally – outdoor pool in summer, indoor pool in winter.\n" +
                        "\n" +
                        "The space\n" +
                        "Our apartment has 1 bedroom, 1 bathroom and an extra toilet. The kitchen is spacious and equipped only with Bosch brand appliances. The apartment is duplex: upstairs is the bedroom, downstairs are the kitchen and living room. The complex offers seasonal facilities.\n" +
                        "\n" +
                        "Other things to note\n" +
                        "Hello! Our apartment is located in a complex with social facilities designed for tourists. We do our best to keep the apartment well-maintained and clean. Throughout the year, it has been in high demand and is ready to welcome you.\n" +
                        "Note: Cleaning service is provided only before check-in. Breakfast or 24/7 technical service is not available. In case of any technical issue, we assist as quickly as possible.\n" +
                        "\n" +
                        "Registration Details\n" +
                        "07-2719");

    }
}