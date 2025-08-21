package org.skypro.skyshop.product;

public class SimpleProduct extends Product   {
    private final double price; // Цена

    public SimpleProduct(String name, double price) throws IllegalAccessException {
        super(name);
        //  Цена должна быть строго больше 0
        if (price <= 0.0) {
            throw new IllegalAccessException("Введена некорректная цена продукта");
        }
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f руб.", getName(), getPrice());
    }
}
