package pl.javastart.task.shop;

import java.util.Objects;

public class Product {
    String name;
    String description;
    double netPrice;
    String category;

    public Product(String name, String description, double netPrice, String category) {
        this(name, description, netPrice);
        this.category = category;
    }

    public Product(String name, String description, double netPrice) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
    }

    public void printInfo(Product product, double grossPrice) {
        System.out.printf("Produkt \"%s\", z kategorii \"%s\", cena netto: %.2f, cena brutto: %.2f %n",
                name, product.getCategory(), netPrice, grossPrice);
    }

    public double getNetPrice() {
        return netPrice;
    }

    public String getCategory() {
        return Objects.requireNonNullElse(category, "Brak kategorii");
    }
}