package com.ava.serviceImpl;

import com.ava.model.Vechicle;
import com.ava.service.VechicleManagement;

public class VechicleManagementImpl implements VechicleManagement {

    @Override
    public Vechicle addVechicle(Vechicle vechicle) throws Exception {
        if(null == vechicle)
            return null;

        //call dao layer to add vechilce to system and generate id for the same
        return vechicle;
    }

    @Override
    public boolean removeVechicle(int vechicleId) throws Exception {
        if( 0!= vechicleId)
            return false;
        // call dao to remove from system
        return false;
    }
}
