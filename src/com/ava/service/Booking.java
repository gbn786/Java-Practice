package com.ava.service;

import com.ava.model.User;
import com.ava.model.Vechicle;

public interface Booking {

    public boolean bookVechicle(User user, Vechicle vechicle) throws Exception;
    public boolean cancelBooking(User user, Vechicle vechicle) throws Exception;

}
