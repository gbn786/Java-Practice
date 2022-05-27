package com.vechicleRentalManagement.model;

import com.vechicleRentalManagement.constants.ReservationStatus;

import java.util.Date;

public class UserBookInfo {
    int userId;
    int vechicleId;
    Date startdate;
    Date returnDate;
    Date expectedRetrunDate;
    ReservationStatus reservationStatus;
}
