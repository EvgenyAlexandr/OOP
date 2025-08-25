package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final double FIXED_PRICE = 127.99; // Константа

    public FixPriceProduct(String name) throws IllegalAccessException {
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
        return String.format("%s: Фиксированная цена %.2f руб.", getNameProduct(), FIXED_PRICE);
    }
}
