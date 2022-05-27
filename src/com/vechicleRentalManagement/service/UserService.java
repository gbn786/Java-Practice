package com.vechicleRentalManagement.service;

import com.vechicleRentalManagement.model.User;

public interface UserService {
    boolean isExist(User user) throws Exception;
}
