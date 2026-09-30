package com.example.pr1;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class description4 extends AppCompatActivity {
    TextView txtDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_description4);
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
                        "Welcome to Joury's Gravity, your serene escape in the heart of BATROUN OLD SOUKS. Just moments away from vibrant restaurants, pubs, cafés, and iconic attractions, this cozy apartment offers comfort and convenience for up to 3 guests. Experience the best of Batroun’s charm while enjoying a peaceful stay in this centrally located retreat.\n" +
                        "\n" +
                        "The space\n" +
                        "This serene bedroom is designed for ultimate comfort, featuring a cozy bed with fresh linens, soft lighting, and practical storage. Its minimalistic charm creates a relaxing atmosphere, perfect for unwinding after a day of exploring.\n" +
                        "\n" +
                        "The bright living area is ideal for relaxing or socializing, with a comfy L-shaped sofa, a stylish coffee table, and tasteful decor. The open layout, natural light, and vibrant touches make it a warm and inviting space for your stay.\n" +
                        "\n" +
                        "Guest access\n" +
                        "Enjoy a self check-in access anytime at your convenience by using our lockbox\n" +
                        "\n" +
                        "Other things to note\n" +
                        "***Please find below a list of Important notes:\n" +
                        "\n" +
                        "- As per Lebanese law, please note that a digital copy of your ID has to be sent to us upon booking confirmation.\n" +
                        "\n" +
                        "- events, parties, professional or commercial photography are not allowed.\n" +
                        "A penalty fee of $1,000 will apply in case rules are broken!\n" +
                        "\n" +
                        "- Always check if the gas tank is open when you need to use the stove.\n" +
                        "\n" +
                        "-*please note that the building is under renovation which could lead to some noise*.");

    }
}