package pl.javastart.task.Shop;

public class SalesDepartment {

    public double grossPrice(Product product) {
        switch (product.category) {
            case "Nabiał":
                return product.getNetPrice() * 1.23;
            case "Słodycze":
                return product.getNetPrice() * 1.08;
            case null:
                return product.getNetPrice() * 1.03;
            default:
                return product.getNetPrice() * 1.03;
        }
    }
}
