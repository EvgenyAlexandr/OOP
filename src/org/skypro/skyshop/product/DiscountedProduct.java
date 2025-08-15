package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final double basePrice; // Базовая цена
    private final int discount;     // Скидка

    public DiscountedProduct(String name, double basePrice, int discount) {
        super(name);
        this.basePrice = basePrice;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return basePrice * (100 - discount) / 100;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f руб. (%d%% скидка)", getName(), getPrice(), discount);
    }
}
