package com.ava.model;

import java.util.List;

public class DynamicPrice extends Price {
    List<PriceType> priceType;
    double SurgeRate; //base*0.25
}
