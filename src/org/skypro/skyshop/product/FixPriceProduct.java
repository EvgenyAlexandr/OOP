package org.skypro.skyshop.product;

import java.util.Locale;

public class FixPriceProduct extends Product {

    private static final double FIXED_PRICE = 127.99; // Константа

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s: Фиксированная цена %.2f", getName(), FIXED_PRICE);
    }
}
