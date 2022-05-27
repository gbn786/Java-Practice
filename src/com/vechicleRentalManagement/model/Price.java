package com.vechicleRentalManagement.model;

import com.vechicleRentalManagement.constants.VechicleType;

public class Price {
    private double basePrice;
    private VechicleType vechicleType;

    public Price(double basePrice, VechicleType vechicleType) {
        this.basePrice = basePrice;
        this.vechicleType = vechicleType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public VechicleType getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType(VechicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    @Override
    public String toString() {
        return "Price{" +
                "basePrice=" + basePrice +
                ", vechicleType=" + vechicleType +
                '}';
    }
}
