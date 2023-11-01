package pl.javastart.task.shop;

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

    public String getName() {
        return name;
    }

    public double getNetPrice() {
        return netPrice;

    }

    public String getCategory() {
        if (category != null) {
            return category;
        } else {
            return "BRAK";
        }
    }
}
