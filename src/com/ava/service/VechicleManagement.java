package com.ava.service;

import com.ava.model.Vechicle;

public interface VechicleManagement {
    public Vechicle addVechicle(Vechicle vechicle) throws Exception;
    public boolean removeVechicle(int VechicleId) throws Exception;
}
