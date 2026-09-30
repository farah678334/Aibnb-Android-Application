package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description8 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description8);
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
                        "1st Floor, NO ELEVATOR\n" +
                        "\n" +
                        "A hidden oasis in Cihangir's center, this newly refurbished apartment offers a large terrace in the back of the building, overlooking trees and characteristic abandoned buildings.\n" +
                        "2 bedrooms, a large living room and a lot of light, with modern full kitchen and furniture ensure a very comfortable stay for up to six guests.\n" +
                        "A perfect hideout in the heart of hip city life, just a few minutes to any attraction you could be looking for.\n" +
                        "\n" +
                        "The space\n" +
                        "This is a 2 bedroom apartment, freshly renovated with modern tiles, a design kitchen and a large terrace to enjoy.\n" +
                        "\n" +
                        "Both bedrooms have queen size beds.\n" +
                        "\n" +
                        "You can spend all your short and long stays comfortably with every bit of item present in the apartment (iron, haridryer, full kitchen euipment, and a laptop size safe).\n" +
                        "\n" +
                        "Guest access\n" +
                        "This apartment is for the sole use of our guests.\n" +
                        "\n" +
                        "Other things to note\n" +
                        "This apartment is on the 1st floor of the building and there is no elevator.\n" +
                        "\n" +
                        "We share a long list of good restaurants and sightseeing spots with our guests who are interested in special experiences.\n" +
                        "\n" +
                        "Registration Details\n" +
                        "34-31061");

    }
}