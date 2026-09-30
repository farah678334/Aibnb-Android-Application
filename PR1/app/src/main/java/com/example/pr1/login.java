package com.example.pr1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class login extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> { finish(); // closes the activity and returns to the previous screen
        });
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                return;
            }

            // URL encode email & password
            String url = "http://10.0.2.2/projectmb/login.php?email="
                    + Uri.encode(email)
                    + "&password=" + Uri.encode(password);

            StringRequest request = new StringRequest(Request.Method.GET, url,
                    response -> {
                        response = response.trim(); // remove extra spaces or newlines
                        if (response.startsWith("success")) {
                            String[] parts = response.split("&");
                            String idPart = parts[0].split("=")[1];
                            String namePart = parts[1].split("=")[1];
                            // ✅ Save login state in SharedPreferences
                            getSharedPreferences("UserSession", MODE_PRIVATE)
                                    .edit()
                                    .putBoolean("isLoggedIn", true)
                                    .putInt("user_id", Integer.parseInt(idPart))
                                    .putString("user_name", namePart)
                                    .apply();

                            Intent intent = new Intent(login.this, MainActivity.class);
                            intent.putExtra("user_id", Integer.parseInt(idPart));
                            intent.putExtra("user_name", namePart);
                            startActivity(intent);

                            Toast.makeText(this, "Welcome " + namePart, Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Login failed. new user? create account " + response, Toast.LENGTH_LONG).show();
                        }
                    },
                    error -> Toast.makeText(this, "Error: " + error.getMessage(), Toast.LENGTH_LONG).show()
            );

            RequestQueue queue = Volley.newRequestQueue(this);
            queue.add(request);
        });


    }
}