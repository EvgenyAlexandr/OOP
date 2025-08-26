package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

import java.util.*;

public class ProductBasket {

    private final List<Product> basket; // Лист - Продукты в корзине.

    // Конструктор
    public ProductBasket() {
        basket = new LinkedList<>();
        //basket = new ArrayList<>();
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
    public void printBacket() {
        System.out.println("\nСодержимое корзины:");

        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            System.out.println(element);
        }
        System.out.println("Итого: " + getTotalCost());
        // Вызываем метод - Подсчета количества товаров специального типа.
        getCountSpecialProduct();
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean containsProduct(String name) {
        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getNameProduct().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Метод, Очистки корзины
    public void clearBasket() {
        basket.clear();
        System.out.println("Корзина очищена");

    }

    // Метод, подсчета количества товаров специального типа.
    public void getCountSpecialProduct() {
        int countSpecialProduct = 0;
        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.isSpecial()) {
                countSpecialProduct++;
            }
        }
        System.out.println("Специальных товаров: " + countSpecialProduct);
    }

    // Метод удаления продукта по имени из корзины
    public List<Product> removeProduct(String name) {
        List<Product> removedProduct = new LinkedList<>();
        Iterator<Product> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product != null && product.getNameProduct().equals(name)) {
                removedProduct.add(product);
                iterator.remove();
            }
        }

        System.out.println("Из корзины удалены товары:");

        if (removedProduct.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            // Отображаем список удаляемых товаров.
            iterator = removedProduct.iterator();
            while (iterator.hasNext()) {
                Product element = iterator.next();
                System.out.println(element);
            }
        }
        return removedProduct;
    }
}
