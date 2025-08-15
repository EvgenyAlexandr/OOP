package org.skypro.skyshop;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {

        // Продукты.
        Product product1 = new SimpleProduct("Лимон", 64.0);
        Product product2 = new SimpleProduct("Батон", 54.0);
        Product product3 = new DiscountedProduct("Йогурт", 80.0, 15);
        Product product4 = new DiscountedProduct("Квас",  120.0, 10);
        Product product5 = new FixPriceProduct("Сосиски");
        Product product6 = new FixPriceProduct("Плавленный сыр");

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