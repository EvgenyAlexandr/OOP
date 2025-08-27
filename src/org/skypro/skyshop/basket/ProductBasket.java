package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import java.util.*;

public class ProductBasket {

    private final Map<String, List<Product>> basket; // Map - Продукты в корзине.

    // Конструктор
    public ProductBasket() {
        basket = new HashMap<>();
    }

    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        String productName = product.getNameProduct();
        basket.computeIfAbsent(productName, k -> new ArrayList<>()).add(product);
        System.out.println("Продукт добавлен в корзину");
    }

    // Метод получения общей стоимости корзины
    public double getTotalCost() {
        double totalCost = 0;
        for (List<Product> products : basket.values()) {
            for (Product product : products) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    // Метод, который печатает содержимое корзины
    public void printBacket() {
        System.out.println("\nСодержимое корзины:");

        for (List<Product> products : basket.values()) {
            for (Product product : products) {
                System.out.println(product);
            }
        }
        System.out.println("Итого: " + getTotalCost());
        // Вызываем метод - Подсчета количества товаров специального типа.
        getCountSpecialProduct();
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean containsProduct(String name) {
        return basket.containsKey(name);
    }

    // Метод, Очистки корзины
    public void clearBasket() {
        basket.clear();
        System.out.println("Корзина очищена");
    }

    // Метод, подсчета количества товаров специального типа.
    public void getCountSpecialProduct() {
        int countSpecialProduct = 0;
        for (List<Product> products : basket.values()) {
            for (Product product : products) {
                if (product.isSpecial()) {
                    countSpecialProduct++;
                }
            }
        }
        System.out.println("Специальных товаров: " + countSpecialProduct);
    }

    // Метод удаления продукта по имени из корзины
    public List<Product> removeProduct(String name) {
        List<Product> removedProduct = basket.remove(name);

        System.out.println("Из корзины удалены товары:");

        if (removedProduct == null || removedProduct.isEmpty()) {
            System.out.println("Список пуст");
            return new ArrayList<>();
        } else {
            // Отображаем список удаляемых товаров.
            for (Product product : removedProduct) {
                System.out.println(product);
            }
        }
        return removedProduct;
    }
}
