package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

import java.util.*;


public class ProductBasket {

//    private final Product[] storage = new Product[5];   // Количество продуктов
//    private int count = 0;                              // Счетчик продуктов

    private final List<Product> basket;

    // Конструктор
    public ProductBasket() {
        basket = new LinkedList<>();
    }


    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        basket.add(product);
        System.out.println("Продукт добавлен в корзину");
    }

    // Метод получения общей стоимости корзины
    public double getTotalCost() {
        Iterator<Product> iterator = basket.iterator();
        double totalCost = 0;
        while (iterator.hasNext()) {
            Product element = iterator.next();
            totalCost += element.getPrice();
        }
        return totalCost;
    }

    // Метод, который печатает содержимое корзины
    public void printContents() {
//        if (count == 0) {
//            System.out.println("Корзина пуста");
//            return;
//        }
//
//        System.out.println("Содержимое корзины:");
//        for (int i = 0; i < count; i++) {
//            Product p = storage[i];
//            System.out.println(p.toString());
//        }
//        System.out.println("Итого: " + getTotalCost());
//        // Вызываем метод - Подсчета количества товаров специального типа.
//        getCountSpecialProduct();

        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            System.out.println(element);
        }
        System.out.println("Итого: " + getTotalCost());
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean containsProduct(String name) {
//        for (int i = 0; i < count; i++) {
//            if (storage[i].getName().equals(name)) {
//                return true;
//            }
//        }
//        return false;

        return basket.contains(name);
    }

    // Метод, Очистки корзины
    public void clearBasket() {
//        count = 0;
//        Arrays.fill(storage, null);
//        System.out.println("Корзина очищена");

        basket.clear();
        System.out.println("Корзина очищена");

    }

    // Метод, подсчета количества товаров специального типа.
    public void getCountSpecialProduct() {
//        int countSpecialProduct = 0;
//        for (Product product : storage) {
//            if (product != null && product.isSpecial()) {
//                countSpecialProduct++;
//            }
//        }
//        System.out.println("Специальных товаров: " + countSpecialProduct);

        int countSpecialProduct = 0;
        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next(); // ...
            countSpecialProduct++;
        }
        System.out.println("Специальных товаров: " + countSpecialProduct); //
    }
}
