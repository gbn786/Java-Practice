package com.vechicleRentalManagement.service;

import com.vechicleRentalManagement.model.Vechicle;

public interface VechicleManagement {
    public Vechicle addVechicle(Vechicle vechicle) throws Exception;
    public boolean removeVechicle(int VechicleId) throws Exception;
}
