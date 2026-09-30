package com.example.pr1;

import android.app.DatePickerDialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
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

import org.w3c.dom.Text;

import java.util.Calendar;

public class reserve extends AppCompatActivity {
    EditText etCheckIn, etCheckOut; String checkInDate = "", checkOutDate = "";
    EditText  etGuests;
    Button btnReserve;
    CheckBox cbBreakfast,cbPickup,cbCleaning,cbBed,cbSpa;
    RadioGroup rgPayment;
    String paymentMethod,apartmentName,userName;
    int basePrice,userId;
    TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reserve);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       userId = getIntent().getIntExtra("user_id", -1);
        userName = getIntent().getStringExtra("user_name");

        tvTotal = findViewById(R.id.tvTotal);
        apartmentName = getIntent().getStringExtra("apartmentName");
        basePrice = getIntent().getIntExtra("basePrice", 0);

        etGuests = findViewById(R.id.etGuests);

        btnReserve = findViewById(R.id.rbtn);


        btnReserve.setOnClickListener(v -> {
            makeReservation();
        });
        ImageButton btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> { finish(); // closes the activity and returns to the previous screen
             });
        // Link XML views
        etCheckIn = findViewById(R.id.etCheckIn);
        etCheckOut = findViewById(R.id.etCheckOut);
        // Open date picker when user taps Check-In field
        etCheckIn.setOnClickListener(v -> showDatePicker(true));
        // Open date picker when user taps Check-Out field
        etCheckOut.setOnClickListener(v -> showDatePicker(false));

        cbBreakfast = findViewById(R.id.cb1);
        cbPickup = findViewById(R.id.cb2);
        cbCleaning = findViewById(R.id.cb3);
        cbBed = findViewById(R.id.cb4);
        cbSpa = findViewById(R.id.cb5);

        rgPayment = findViewById(R.id.rgPayment);


    }
    private void showDatePicker(boolean isCheckIn) {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog( this, (view, selectedYear, selectedMonth, selectedDay) -> {
            String date = selectedYear + "-" + (selectedMonth + 1) + "-" + selectedDay; // YYYY-MM-DD
            if (isCheckIn) {
                checkInDate = date;
                etCheckIn.setText("Check-In: " + checkInDate);
            } else { checkOutDate = date; etCheckOut.setText("Check-Out: " + checkOutDate);}
            }, year, month, day );
        datePickerDialog.show();
    }
    private void makeReservation() {
// Parse dates
        String[] inParts = checkInDate.split("-");
        String[] outParts = checkOutDate.split("-");

        Calendar inCal = Calendar.getInstance();
        inCal.set(Integer.parseInt(inParts[0]), Integer.parseInt(inParts[1]) - 1, Integer.parseInt(inParts[2]));

        Calendar outCal = Calendar.getInstance();
        outCal.set(Integer.parseInt(outParts[0]), Integer.parseInt(outParts[1]) - 1, Integer.parseInt(outParts[2]));

        long diff = outCal.getTimeInMillis() - inCal.getTimeInMillis();
        int nights = (int) (diff / (1000 * 60 * 60 * 24));
        int extras = 0;
        if (cbBreakfast.isChecked()) extras += 20;
        if (cbPickup.isChecked()) extras += 30;
        if (cbCleaning.isChecked()) extras += 25;
        if (cbBed.isChecked()) extras += 40;
        if (cbSpa.isChecked()) extras += 50;
        int totalPrice = (basePrice * nights) + extras;
        int selectedId = rgPayment.getCheckedRadioButtonId();
         tvTotal.setText("Total: $" + totalPrice);
        if (selectedId == -1) {
            Toast.makeText(this, "Please select a payment method", Toast.LENGTH_SHORT).show();
            return;
        }
        RadioButton rb = findViewById(selectedId);
         paymentMethod = rb.getText().toString();


        Editable guestsEditable = etGuests.getText();
        String guests = guestsEditable.toString().trim();

        if (checkInDate.isEmpty() || checkOutDate.isEmpty() || guests.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }
        if (nights <= 0) {
            Toast.makeText(this, "Check-out must be after check-in", Toast.LENGTH_SHORT).show();
            return;
        }
        if (apartmentName == null || userId == -1) {
            Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
            return;
        }



        String url = "http://10.0.2.2/projectmb/reserve.php"
                + "?check_in=" + Uri.encode(checkInDate)
                + "&check_out=" + Uri.encode(checkOutDate)
                + "&guests=" + Uri.encode(guests)
                + "&user_id="+ userId
                + "&apartment=" + Uri.encode(apartmentName)
                + "&nights=" + nights
                + "&extras=" + extras
                + "&payment=" + Uri.encode(paymentMethod)
                + "&total=" + totalPrice;

        StringRequest request = new StringRequest(Request.Method.GET, url,
                response -> {
            if (response.contains("error: apartment already reserved")) {
                new androidx.appcompat.app.AlertDialog.Builder(reserve.this)
                        .setTitle("Reservation Error")
                        .setMessage("Apartment already reserved for these dates.")
                        .setPositiveButton("OK", null) .show();
            } else if (response.contains("success")) {
                Toast.makeText(this, "Reservation successful!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Unexpected response: " + response, Toast.LENGTH_LONG).show();
            }
            }, error -> {
            Toast.makeText(this, "Error: " + error.getMessage(), Toast.LENGTH_LONG).show();
        });

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }
}