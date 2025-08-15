package org.skypro.skyshop.product;

public abstract class Product {
    private final String name;

    // Конструктор
    public Product(String name) {
        this.name = name;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    // Абстрактные методы
    public abstract double getPrice();
    public abstract boolean isSpecial();

    @Override
    public abstract String toString();
}


