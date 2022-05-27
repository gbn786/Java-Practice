package com.vechicleRentalManagement.service;

import com.vechicleRentalManagement.model.User;
import com.vechicleRentalManagement.model.Vechicle;

public interface Booking {

    public boolean bookVechicle(User user, Vechicle vechicle) throws Exception;
    public boolean cancelBooking(User user, Vechicle vechicle) throws Exception;

}
