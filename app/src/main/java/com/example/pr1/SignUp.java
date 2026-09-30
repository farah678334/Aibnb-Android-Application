package com.example.pr1;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
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

public class SignUp extends AppCompatActivity {
EditText etName,etEmail,etPassword;
Button btnSignup;
Boolean gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> finish());

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(v -> signupUser());
    }

    private void signupUser() {

        String name = etName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() ) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (gender == null) {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show();
            return;
        }
    // Convert Boolean to string value
      String genderValue = gender ? "male" : "female";
        // ✅ URL using GET
        String url = "http://10.0.2.2/projectmb/register.php"
                + "?name=" + Uri.encode(name)
                + "&email=" + Uri.encode(email)
                + "&password=" + Uri.encode(password)
                + "&gender=" + Uri.encode(genderValue);

        StringRequest request = new StringRequest(Request.Method.GET, url,
                response -> {
                    response = response.trim();

                    if (response.equals("success")) {
                        Toast.makeText(this, "Signup successful", Toast.LENGTH_LONG).show();
                        finish(); // go back
                    } else {
                        Toast.makeText(this, "Signup failed: " + response, Toast.LENGTH_LONG).show();
                    }
                },
                error -> Toast.makeText(this, "Network error: " + error.getMessage(), Toast.LENGTH_LONG).show()
        );

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }
    public void radioF(View v){
        if(v.getId()==R.id.female)
            gender=false;
        else if(v.getId()==R.id.male)
            gender=true;
    }
}

