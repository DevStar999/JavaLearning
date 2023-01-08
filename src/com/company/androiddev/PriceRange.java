package com.company.androiddev;

import lombok.Getter;

@Getter
public enum PriceRange {
    ALGERIA("Algeria", "DZD", 7.9f, 56000f);

    private final String country;
    private final String currency;
    private final double minPrice;
    private final double maxPrice;

    PriceRange(String country, String currency, double minPrice, double maxPrice) {
        this.country = country;
        this.currency = currency;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }
}
