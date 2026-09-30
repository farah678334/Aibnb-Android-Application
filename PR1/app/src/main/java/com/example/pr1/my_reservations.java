package com.example.pr1;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class my_reservations extends AppCompatActivity {
    ImageButton btnClose;
    ListView listView;
    int userId;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_reservations);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnClose = findViewById(R.id.btnClose);

        btnClose.setOnClickListener(v -> finish());


        listView = findViewById(R.id.listViewReservations);
        // Get login data
        userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");
        // Fetch reservations
        String url = "http://10.0.2.2/projectmb/my_reservations.php?user_id=" + userId;
        StringRequest request = new StringRequest(Request.Method.GET, url, response -> {
            try {
                JSONObject jsonObject = new JSONObject(response);

                // Check status
                String status = jsonObject.getString("status");
                if (!status.equals("success")) {
                    Toast.makeText(this, "Server error", Toast.LENGTH_LONG).show();
                    return;
                }

                // Get reservations array
                JSONArray arr = jsonObject.getJSONArray("reservations");
                ArrayList<Reservation> reservations = new ArrayList<>();

                for (int i = 0; i < arr.length(); i++) {
                    JSONObject obj = arr.getJSONObject(i);
                    String id = obj.getString("id");
                    String apartment = obj.getString("apartment");
                    String checkIn = obj.getString("check_in");
                    String checkOut = obj.getString("check_out");
                    String guests = obj.getString("guests");
                    String total = obj.getString("total_price");
                    reservations.add(new Reservation(id, apartment, checkIn, checkOut, guests, total)); }


                if (reservations.isEmpty()) {
                    Toast.makeText(this, "No reservations found", Toast.LENGTH_LONG).show();
                }

                ReservationAdapter adapter = new ReservationAdapter(this, reservations, userId,userName);
                listView.setAdapter(adapter);


            } catch (Exception e) {
                Toast.makeText(this, "Parse error: " + e.toString(), Toast.LENGTH_LONG).show();
            }
        }, error -> {
            Toast.makeText(this, "Volley error: " + error.toString(), Toast.LENGTH_LONG).show();
        });

// ✅ Add request to queue
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }
}
            









