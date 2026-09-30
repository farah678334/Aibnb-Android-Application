package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description6 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description6);
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
                        "Charming Parisian cocoon with the calm of a secure courtyard and the proximity of Montmartre (10 min walk). Bright apartment perfect for couples or solo travelers with separate bedroom + sofa bed. Ultra-convenient transport: metro line 4 5 min, line 12 8 min, central Paris 20 min.\n" +
                        "Equipped kitchen, Wi-Fi, everything to discover Paris!\n" +
                        "\n" +
                        "\n" +
                        "Metro line 4 → Châtelet, Île de la Cité, Saint-Germain\n" +
                        "Metro line 12 → Opéra, Louvre, Concorde\n" +
                        "Louvre, Notre-Dame, Marais: less than 30 min\n" +
                        "The space\n" +
                        "Your Parisian refuge (37 m²)\n" +
                        "\n" +
                        "•Cozy bedroom: Comfortable double bed (140x190), linen provided, optimized storage\n" +
                        "\n" +
                        "• Friendly living room: Extra sofa bed, Bluetooth speaker for your playlists, fan\n" +
                        "\n" +
                        "• Fully equipped kitchen: Espresso machine for your Parisian mornings, oven, induction cooktop, fridge, toaster, washing machine, all the essentials for cooking\n" +
                        "\n" +
                        "• Full bathroom: Shower, towels, hair dryer\n" +
                        "\n" +
                        "• Connectivity: High-speed WiFi to share your discoveries\n" +
                        "\n" +
                        "Other things to note\n" +
                        "No smoking apartment\n" +
                        "Pets not allowed\n" +
                        "Forbidden parties\n" +
                        "Not accessible PRM\n" +
                        "Flexible check-in based on availability\n" +
                        "Registration Details\n" +
                        "7511815775353");

    }
}