package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description3 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> { finish(); // closes the activity and returns to the previous screen
        });
        txtDescription=findViewById(R.id.tv1);
        txtDescription.setText(
                "About this space\n" +
                        "Unwind at this beachside chalet in a central location of Batroun. Fully furnished for your comfort.\n" +
                        "Enjoy a sea view from the terrace, the chalet is located in a central location only few minutes walking distance to the beach and popular beach bars.\n" +
                        "\n" +
                        "Batroun is the ideal leisure destination. It is one of the most beautiful coastal cities in Lebanon, and one of the oldest in the world.\n" +
                        "It has history, architecture, churches, beaches, bars, seafood, lemonade, and much more!\n" +
                        "\n" +
                        "A copy of the passport is required upon check-in. Please be advised that the rooftop and the Jacuzzi have no ceiling thus they can't be used during rainy weather.\n" +
                        "\n" +
                        "The space\n" +
                        "The Chalet consists of one bedroom with a comfortable living space, one bathroom, a kitchenette and a terrace with a sea view.\n" +
                        "\n" +
                        "Other things to note\n" +
                        "*** Please find below a list of important notes:\n" +
                        "\n" +
                        "- Smoking, events, parties, professional or commercial photography are not allowed.\n" +
                        "A penalty fee of $1,000 will apply in case rules are broken!\n" +
                        "\n" +
                        "- As per Lebanese law, guests are required to provide us with their ID upon booking confirmation.\n" +
                        "\n" +
                        "- Always check if the gas tank is open when you need to use the stove." );




    }
}