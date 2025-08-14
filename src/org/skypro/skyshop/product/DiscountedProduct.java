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
}
