package pl.javastart.task;

import pl.javastart.task.Shop.Product;
import pl.javastart.task.Shop.SalesDepartment;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "3.2%", 2.20, "Nabiał");
        Product product2 = new Product("Czekolada", "gorzka", 4.60, "Słodycze");
        Product product3 = new Product("Łosoś", "mrożony", 64.60, "Mrożonki");
        Product product4 = new Product("Pomidor", "gałązka", 2.60,"inna");

        SalesDepartment salesDepartment = new SalesDepartment();

        double grossPrice1 = salesDepartment.grossPrice(product1);
        double grossPrice2 = salesDepartment.grossPrice(product2);
        double grossPrice3 = salesDepartment.grossPrice(product3);
        double grossPrice4 = salesDepartment.grossPrice(product4);

        System.out.printf("Produkt: %s, z kategorii %s, cena netto: %.2f, cena brutto: %.2f %n", product1.getName(), product1.getCategory(), product1.getNetPrice(), grossPrice1);
        System.out.printf("Produkt: %s, z kategorii %s, cena netto: %.2f, cena brutto: %.2f %n", product2.getName(), product2.getCategory(), product2.getNetPrice(), grossPrice2);
        System.out.printf("Produkt: %s, z kategorii %s, cena netto: %.2f, cena brutto: %.2f %n", product3.getName(), product3.getCategory(), product3.getNetPrice(), grossPrice3);
        System.out.printf("Produkt: %s, z kategorii %s, cena netto: %.2f, cena brutto: %.2f %n", product4.getName(), product4.getCategory(), product4.getNetPrice(), grossPrice4);

    }
}