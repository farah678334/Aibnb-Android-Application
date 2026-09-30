package com.example.pr1;

import android.content.Intent;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pr1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    ListView listView;
    String[] apartmentNames = {"Achrafieh Rooftop 1-BR W Jacuzzi", "Entire rental unit in Jumayza, Lebanon", "Chalet with a Sea View in Batroun 24/7 Electricity","Blue Bird in Batroun Old Souks","100 m2 apartment, spacious and typical Parisian", "Comfort a stone's throw from Montmartre", "Palm Island: Elegant Oasis 1 Min from the Beach","Nice loft in the Jean Médecin neighborhood","Charming flat with stunning view", "07 Superb Terrace, Heart of Cihangir, fibernet"};
    int[] apartmentImages = {R.drawable.ap1, R.drawable.ap2, R.drawable.ap3,R.drawable.ap4, R.drawable.ap5, R.drawable.ap6,R.drawable.ap7, R.drawable.ap8, R.drawable.ap9,R.drawable.ap10};
    int userId;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
         userId = getIntent().getIntExtra("user_id", -1);
         userName = getIntent().getStringExtra("user_name");
        listView=(ListView) findViewById(R.id.listView);
        Set<String> currentWishlist = new HashSet<>();

        String url = "http://10.0.2.2/projectmb/wishlist.php?user_id=" + userId;
        StringRequest request = new StringRequest(Request.Method.GET, url, response -> {
            try {
                JSONObject json = new JSONObject(response);
                JSONArray arr = json.getJSONArray("wishlist");
                for (int i = 0; i < arr.length(); i++) {
                    currentWishlist.add(arr.getString(i));
                }
                ApartmentAdapter adapter = new ApartmentAdapter( this, apartmentNames, apartmentImages, userId, userName, currentWishlist );
                listView.setAdapter(adapter);
            }
            catch (Exception e) {
                Toast.makeText(this, "Parse error: " + e.toString(), Toast.LENGTH_LONG).show();
            } }, error -> Toast.makeText(this, "Volley error: " + error.toString(), Toast.LENGTH_LONG).show());
        Volley.newRequestQueue(this).add(request);



        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if (id == R.id.action_login) {

            Intent intent = new Intent(MainActivity.this, login.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.action_signup) {


            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.action_myreservations) {
            //Toast.makeText(this,"Favoriets",Toast.LENGTH_LONG).show();


            Intent intent = new Intent(MainActivity.this, my_reservations.class);
            intent.putExtra("user_id", userId);
            intent.putExtra("user_name", userName);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_favoriets) {
            Intent intent = new Intent(MainActivity.this, Wishlist.class);
            intent.putExtra("user_id", userId);
            startActivity(intent);
            return true;

        }
        if (id == R.id.action_logout) {
            boolean isLoggedIn = getSharedPreferences("UserSession", MODE_PRIVATE)
                    .getBoolean("isLoggedIn", false);
            if (isLoggedIn) {
                // Clear session
                getSharedPreferences("UserSession", MODE_PRIVATE)
                        .edit()
                        .clear()
                        .apply();
                Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show();
                // Redirect to login
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);

            } else {
                Toast.makeText(this, "You are not logged in", Toast.LENGTH_SHORT).show();
            }
            return true;

        }
            return super.onOptionsItemSelected(item);
        }


    }


