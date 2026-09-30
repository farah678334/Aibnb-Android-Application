package com.example.pr1;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pr1.databinding.ActivityWishlistBinding;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Wishlist extends AppCompatActivity {
    ListView listView;
    int userId;
    private AppBarConfiguration appBarConfiguration;
    private ActivityWishlistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityWishlistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> { finish(); // closes the activity and returns to the previous screen
        });

        int[] apartmentImages = {R.drawable.ap1, R.drawable.ap2, R.drawable.ap3,R.drawable.ap4, R.drawable.ap5, R.drawable.ap6,R.drawable.ap7, R.drawable.ap8, R.drawable.ap9,R.drawable.ap10};
        listView = findViewById(R.id.listViewWishlist);
        userId = getIntent().getIntExtra("user_id", -1);
        String url = "http://10.0.2.2/projectmb/wishlist.php?user_id=" + userId;
        StringRequest request = new StringRequest(Request.Method.GET, url, response -> {
            try { JSONObject json = new JSONObject(response);
                JSONArray arr = json.getJSONArray("wishlist");
                ArrayList<String> wishlist = new ArrayList<>();
                for (int i = 0; i < arr.length(); i++) { wishlist.add(arr.getString(i)); }
                wishlistAdapter adapter = new wishlistAdapter(this, wishlist,apartmentImages);
                listView.setAdapter(adapter);
            } catch (Exception e) {
                Toast.makeText(this, "Parse error: " + e.toString(), Toast.LENGTH_LONG).show();
            } }, error ->
                Toast.makeText(this, "Volley error: " + error.toString(), Toast.LENGTH_LONG).show());
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
        }


