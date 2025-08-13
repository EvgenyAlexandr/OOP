package org.skypro.skyshop.product;

public class App {
    public static void main(String[] args) {
        // Демонстрация классов
        // Продукты.
        Product product1 = new Product("Лимон",          64);
        Product product2 = new Product("Батон порезанный", 54);
        Product product3 = new Product("Йогурт",         80);
        Product product4 = new Product("Квас",           120);
        Product product5 = new Product("Сосиски",        300);
        Product product6 = new Product("Плавленный сыр", 20);

        ProductBasket basket = new ProductBasket();

        // 1. Добавление продукта в корзину.
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        // 2. Добавление продукта в заполненную корзину.
        basket.addProduct(product6);

        // 3. Печать содержимого корзины с несколькими товарами.
        System.out.println();
        basket.printContents();


    }
}