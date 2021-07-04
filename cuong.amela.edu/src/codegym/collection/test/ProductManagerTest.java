package codegym.collection.test;

import codegym.collection.source.Product;
import codegym.collection.source.ProductManager;

import java.util.*;

public class ProductManagerTest {

    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        //List<Product> product = new LinkedList<>();
        product.add(new Product("2345", "A", 1111));
        product.add(new Product("1234", "B", 8422));
        product.add(new Product("2314", "C", 2314));
        product.add(new Product("3456", "D", 5363));
        product.add(new Product("8621", "E", 9643));

        ProductManager manager = new ProductManager(product);
        manager.addProduct(new Product("2525", "K", 134144));
        manager.addProduct(new Product("9035", "H", 3144));
        manager.findProduct("A");
        manager.changePropertyProductById("2345");
        manager.sortingWithListProduct();
        manager.printListProduct();
    }
}
