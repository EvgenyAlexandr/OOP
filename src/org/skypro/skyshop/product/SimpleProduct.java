package org.skypro.skyshop.product;
import java.util.Locale;

public class SimpleProduct extends Product   {
    private final double price;

    public SimpleProduct(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s: %.2f", getName(), getPrice());
    }
}
