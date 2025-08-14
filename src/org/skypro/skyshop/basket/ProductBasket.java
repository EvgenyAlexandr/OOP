package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private final Product[] storage = new Product[5];   // Количество продуктов
    private int count = 0;                              // Счетчик продуктов

    // Метод добавления продукта в корзину
    public void addProduct(Product product) {
        if (count < storage.length) {
            storage[count++] = product;
        } else {
            System.out.println("Корзина переполнена!");
        }
    }

    // Метод получения общей стоимости корзины
    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += storage[i].getPrice();
        }
        return total;
    }

    // Метод, который печатает содержимое корзины
    public void printContents() {
        if (count == 0) {
            System.out.println("Корзина пуста");
            return;
        }

        System.out.println("Содержимое корзины:");
        for (int i = 0; i < count; i++) {
            Product p = storage[i];
            System.out.printf("%s: %.2f руб.\n", p.getName(), p.getPrice());
        }
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean containsProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (storage[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Метод очистки корзины
    public void clearBasket() {
        count = 0;
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
        System.out.println("Корзина очищена");
    }
}
