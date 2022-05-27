package com.vechicleRentalManagement.model;

import com.vechicleRentalManagement.constants.PriceType;
import com.vechicleRentalManagement.constants.VechicleType;

import java.util.List;

public class DynamicPrice extends Price {
    List<PriceType> priceType;
    double SurgeRate; //base*0.25

    public DynamicPrice(double basePrice, VechicleType vechicleType, List<PriceType> priceType, double surgeRate) {
        super(basePrice, vechicleType);
        this.priceType = priceType;
        SurgeRate = surgeRate;
    }

    public List<PriceType> getPriceType() {
        return priceType;
    }

    public void setPriceType(List<PriceType> priceType) {
        this.priceType = priceType;
    }

    public double getSurgeRate() {
        return SurgeRate;
    }

    public void setSurgeRate(double surgeRate) {
        SurgeRate = surgeRate;
    }

    @Override
    public String toString() {
        return "DynamicPrice{" +
                "priceType=" + priceType +
                ", SurgeRate=" + SurgeRate +
                '}';
    }
}
