package org.skypro.skyshop.product;

abstract public class Product {
    private final String name;

    // Конструктор
    public Product(String name) {
        this.name = name;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    // Абстрактный метод
    public abstract double getPrice();

}


