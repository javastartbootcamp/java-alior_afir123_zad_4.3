package pl.javastart.task;

import pl.javastart.task.shop.Product;
import pl.javastart.task.shop.SalesDepartment;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "3.2%", 2.20, "Nabiał");
        Product product2 = new Product("Czekolada", "gorzka", 4.60, "Słodycze");
        Product product3 = new Product("Łosoś", "mrożony", 64.60, "Mrożonki");
        Product product4 = new Product("Pomidor", "gałązka", 2.60);

        SalesDepartment salesDepartment = new SalesDepartment();

        double grossPrice1 = salesDepartment.grossPrice(product1);
        double grossPrice2 = salesDepartment.grossPrice(product2);
        double grossPrice3 = salesDepartment.grossPrice(product3);
        double grossPrice4 = salesDepartment.grossPrice(product4);

        product1.printInfo(product1, grossPrice1);
        product2.printInfo(product2, grossPrice2);
        product3.printInfo(product3, grossPrice3);
        product4.printInfo(product4, grossPrice4);

    }


}