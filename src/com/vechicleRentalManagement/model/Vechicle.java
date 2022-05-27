package com.vechicleRentalManagement.model;

import com.vechicleRentalManagement.constants.VechicleType;
import com.vechicleRentalManagement.constants.VehicleStatus;

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
    VehicleStatus vehicleStatus;

    public Vechicle(int vechicleId, VechicleType vechicleType, String regNo, VehicleStatus vehicleStatus) {
        this.vechicleId = vechicleId;
        this.vechicleType = vechicleType;
        this.regNo = regNo;
        this.vehicleStatus = vehicleStatus;
    }

    public int getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(int vechicleId) {
        this.vechicleId = vechicleId;
    }

    public VechicleType getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(VechicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    @Override
    public String toString() {
        return "Vechicle{" +
                "vechicleId=" + vechicleId +
                ", vechicleType=" + vechicleType +
                ", regNo='" + regNo + '\'' +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }

}
