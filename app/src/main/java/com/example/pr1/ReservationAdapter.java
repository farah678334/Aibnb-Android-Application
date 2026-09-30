package com.example.pr1;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class ReservationAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Reservation> reservations;
    private int userId;
    private String userName;
    public ReservationAdapter(Context context, ArrayList<Reservation> reservations, int userId,String userName) {
        this.context = context;
        this.reservations = reservations;
        this.userId = userId;
        this.userName = userName;
    }
    @Override
    public int getCount() {
        return reservations.size();
    }

    @Override
    public Object getItem(int position) {
        return reservations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.reservation_row, parent, false);
        }
        TextView tvDetails = convertView.findViewById(R.id.tvReservationDetails);
        Button btnCancel = convertView.findViewById(R.id.btnCancelReservation);
        Reservation res = reservations.get(position);
        tvDetails.setText( "Reservation ID: " + res.getId() + "\n"
                + "User: " + userName + "\n" + // you can pass userName into adapter if needed "Apartment: "
                 res.getApartment() + "\n" +
                "Check-In: " + res.getCheckIn() + "\n"
                + "Check-Out: " + res.getCheckOut() + "\n"
                + "Guests: " + res.getGuests() + "\n"
                + "Total: $" + res.getTotalPrice() );
        btnCancel.setOnClickListener(v -> {
            new AlertDialog.Builder(context)
                    .setTitle("Cancel Reservation")
                    .setMessage("Are you sure you want to cancel this reservation?")
                    .setPositiveButton("Yes", (dialog, which) -> {
                        String url = "http://10.0.2.2/projectmb/cancel_reservation.php?reservation_id=" + res.getId() + "&user_id=" + userId;
                        StringRequest request = new StringRequest(Request.Method.GET, url, response -> {
                            if (response.contains("success")) { reservations.remove(position); notifyDataSetChanged();
                                Toast.makeText(context, "Your payment has been returned to your account", Toast.LENGTH_LONG).show();
                            } }, error -> Toast.makeText(context, "Error: " + error.toString(), Toast.LENGTH_SHORT).show() );
                        Volley.newRequestQueue(context).add(request);
                    }) .setNegativeButton("No", (dialog, which) -> dialog.dismiss()) .show();
        });
        return convertView;
    }
}
