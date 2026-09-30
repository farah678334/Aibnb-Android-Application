package com.example.pr1;

public class Reservation {
    private String id;
    private String apartment;
    private String checkIn;
    private String checkOut;
    private String guests;
    private String totalPrice;
    public Reservation(String id, String apartment, String checkIn, String checkOut, String guests, String totalPrice) {
        this.id = id;
        this.apartment = apartment;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.guests = guests;
        this.totalPrice = totalPrice;
    }
    public String getId() {
        return id;
    }
    public String getApartment() {
        return apartment;
    }
    public String getCheckIn() {
        return checkIn;
    }
    public String getCheckOut() {
        return checkOut;
    }
    public String getGuests() {
        return guests;
    }
    public String getTotalPrice() {
        return totalPrice;
    }
}
