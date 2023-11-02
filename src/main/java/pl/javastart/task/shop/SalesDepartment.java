package pl.javastart.task.shop;

public class SalesDepartment {

    double vat1 = 0.23;
    double vat2 = 0.08;
    double vat3 = 0.03;

    @SuppressWarnings("EnhancedSwitchMigration")
    public double grossPrice(Product product) {
        switch (product.category) {
            case "Nabiał":
                return product.getNetPrice() * (1+vat1);
            case "Słodycze":
                return product.getNetPrice() * (1+vat2);
            case null, default:
                return product.getNetPrice() * (1+vat3);
        }
    }
}
