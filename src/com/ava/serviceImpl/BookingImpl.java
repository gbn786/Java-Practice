package com.ava.serviceImpl;

import com.ava.model.User;
import com.ava.model.Vechicle;
import com.ava.service.Booking;

public class BookingImpl implements Booking {
    @Override
    public boolean bookVechicle(User user, Vechicle vechicle) throws Exception {
        //validation of user and vechile
        // call dao to save booking
        return false;
    }

    @Override
    public boolean cancelBooking(User user, Vechicle vechicle) throws Exception {
        return false;
    }
}
