package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
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

        // ===============================
        Article lemon   = new Article("Лимон","Растение вид рода Цитрус (Citrus) подтрибы Цитрусовые (Citrinae) семейства Рутовые (Rutaceae). Лимоном также называется плод (гесперидий) этого растения.");
        Article loaf    = new Article("Батон","Распространённый вид булочных изделий наряду с плетёными изделиями, булками, сайками и булочной мелочью. Батоны производят из пшеничной муки высшего, 1-го и 2-го сортов.");
        Article yogurt  = new Article("Йогурт","Кисломолочный продукт с повышенным содержанием сухих веществ, изготовляемый путём сквашивания протосимбиотической смесью чистых культур.");
        Article kvass   = new Article("Квас","традиционный славянский и балтский кислый напиток, который готовят на основе брожения из ржаной муки и солода (ржаного, ячменного) или из сухого ржаного хлеба, иногда — с добавлением пахучих трав, мёда, пчелиных сот. Также квас могут готовить из свёклы, фруктов, ягод.");

        // Класс для поиска по ключевому слову
        SearchEngine list = new SearchEngine(10);
        // Добавляем объекты в массив
        list.addToSearchable(product1);
        list.addToSearchable(product2);
        list.addToSearchable(product3);
        list.addToSearchable(product4);
        list.addToSearchable(product5);

        list.addToSearchable(lemon);
        list.addToSearchable(loaf);
        list.addToSearchable(yogurt);
        list.addToSearchable(kvass);

        //Проверяю все ли добавлено в массив
        list.showSearchable();

        // Поиск по ключевому слову
        String keyword = "Лимон";
        System.out.println("\nКлючевое слово для поиска: " + keyword);
        System.out.println("Результат поиска:");
        list.searchByKeyword(keyword);

        // ===============================
        System.out.println("\nИсключения:");
        // Демонстрация работы исключений.
        try {
            Product product7 = new SimpleProduct("Лимон", -64.0);
        } catch (IllegalAccessException exceptions) {
            System.out.println(exceptions.getMessage());
        }

        try {
            Product product8 = new DiscountedProduct("Йогурт", -80.0, 15);
        } catch (IllegalAccessException exceptions) {
            System.out.println(exceptions.getMessage());
        }

        try {
            Product product9 = new DiscountedProduct("Йогурт", 80.0, -15);
        } catch (IllegalAccessException exceptions) {
            System.out.println(exceptions.getMessage());
        }

        try {
            Product product10 = new FixPriceProduct(" ");
        } catch (IllegalAccessException exceptions) {
            System.out.println(exceptions.getMessage());
        }



    }


}
