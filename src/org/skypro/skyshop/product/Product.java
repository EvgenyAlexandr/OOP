package org.skypro.skyshop.product;

import java.util.Objects;

public abstract class Product implements Searchable {
    private final String nameProduct; // Название продукта

    // Конструктор
    public Product(String name) throws IllegalAccessException {
        // Проверка на null и пустую строку
        if (name == null || name.isBlank()){
            throw new IllegalAccessException("Введено некорректное название продукта");
        }
        this.nameProduct = name;
    }

    // Геттеры
    @Override
    public String getNameProduct() {
        return nameProduct;
    }

    // Абстрактные методы
    public abstract double getPrice();
    public abstract boolean isSpecial();

    @Override
    public abstract String toString();

    @Override
    public String getSearchTerm() {
        return nameProduct;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameProduct);
    }
}


