package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        // Продукты.
        Product product1 = new SimpleProduct("Лимон",            64.0);
        Product product2 = new SimpleProduct("Батон порезанный", 54.0);
        Product product3 = new SimpleProduct("Йогурт",           80.0);
        Product product4 = new SimpleProduct("Квас",             120.0);
        Product product5 = new SimpleProduct("Сосиски",          300.20);
        Product product6 = new SimpleProduct("Плавленный сыр",   20.40);

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

        // 4. Получение стоимости корзины с несколькими товарами.
        System.out.println();
        System.out.println("Общая стоимость продуктов: " + basket.getTotalCost() + " руб.");
        System.out.println();

        // 5. Поиск товара, который есть в корзине.
        System.out.println("Товар 'Сосиски': " + basket.containsProduct("Сосиски"));

        // 6. Поиск товара, которого нет в корзине..
        System.out.println("Товар 'Банан': " + basket.containsProduct("Банан"));

        // 7. Очистка корзины.
        System.out.println();
        basket.clearBasket();

        // 8. Печать содержимого пустой корзины.
        System.out.println();
        basket.printContents();

        // 9. Получение стоимости пустой корзины.
        System.out.println("Общая стоимость продуктов: " + basket.getTotalCost() + " руб.");

        // 10. Поиск товара по имени в пустой корзине.
        System.out.println();
        System.out.println("Товар 'Сосиски': " + basket.containsProduct("Сосиски"));

    }
}