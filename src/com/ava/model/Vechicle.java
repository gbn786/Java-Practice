package com.ava.model;

/**
 * LLD : Vehicle rental application
 * Users should be able to book(rent)/cancel vehicles.
 * There are different types of vehicles supported by the system.
 * Admins can add/remove vehicles.
 * Pricing based on different parameters.
 */
public class Vechicle {
    int vechicleId;
    VechicleType vechicleType; //HatchBag, Sedan, SUV
    String regNo;
    VechicleStatus vechicleStatus; // Booked, Free, Deactivated, Available

}
