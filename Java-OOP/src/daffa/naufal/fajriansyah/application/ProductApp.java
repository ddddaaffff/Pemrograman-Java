// Access Modifier (2)
package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Logitech Mouse", 329000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}