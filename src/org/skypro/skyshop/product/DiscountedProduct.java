package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private final double basePrice; // Базовая цена
    private final int discount;     // Скидка

    public DiscountedProduct(String name, double basePrice, int discount) throws IllegalAccessException {
        super(name);

        //   Условие вызова исключения - Должно быть строго больше 0
        if (basePrice <= 0.0) {
            throw new IllegalAccessException("Введена некорректная цена продукта");
        }
        //  Условие вызова исключения - Должно быть в диапазоне 0-100 включительно
        if (discount < 0.0 || discount > 100.0) {
            throw new IllegalAccessException("Введена некорректная скидка на продукт");
        }
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
