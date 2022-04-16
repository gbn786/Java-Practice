package com.ava.model;

/**
 * LLD : Vehicle rental application
 * Users should be able to book(rent)/cancel vehicles.
 * There are different types of vehicles supported by the system.
 * Admins can add/remove vehicles.
 * Pricing based on different parameters.
 */
public class User {
    int id;
    String name;
    String address;
    UserStatus userStatus;// Approved, NotApproved;
    String dlInfo;
    String comment;

}
