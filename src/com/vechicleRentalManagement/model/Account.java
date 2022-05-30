package com.vechicleRentalManagement.model;

import com.vechicleRentalManagement.constants.AccountStatus;

public abstract class Account {
    private String id;
    private String password;
    private AccountStatus accountStatus;
    private Person person;
}
