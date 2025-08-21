package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    private final String name; // Название продукта

    // Конструктор
    public Product(String name) throws IllegalAccessException {
        // Проверка на null и пустую строку
        if (name == null || name.isBlank()){
            throw new IllegalAccessException("Введено некорректное название продукта");
        }
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

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }
}


