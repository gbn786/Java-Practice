package com.vechicleRentalManagement.serviceImpl;

import com.vechicleRentalManagement.model.User;
import com.vechicleRentalManagement.model.Vechicle;
import com.vechicleRentalManagement.service.Booking;
import com.vechicleRentalManagement.service.UserService;
import com.vechicleRentalManagement.service.VechicleService;

public class BookingImpl implements Booking {

    private final UserService userService;
    private final VechicleService vechicleService;

    //constructor
    public BookingImpl(UserService userService, VechicleService vechicleService) {
        this.userService = userService;
        this.vechicleService = vechicleService;
    }

    @Override
    public boolean bookVechicle(User user, Vechicle vechicle) throws Exception {
        // check if user is valid
        if (!userService.isExist(user))
            return false;

        return true;
    }

    @Override
    public boolean cancelBooking(User user, Vechicle vechicle) throws Exception {
        return false;
    }
}
