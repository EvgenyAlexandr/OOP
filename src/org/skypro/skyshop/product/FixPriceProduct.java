package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final double FIXED_PRICE = 127.99; // Константа

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return FIXED_PRICE;
    }
}
