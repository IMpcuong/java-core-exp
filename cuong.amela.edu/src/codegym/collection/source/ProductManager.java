package codegym.collection.source;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager extends Product {

    public Scanner scanner;
    private List<Product> listProduct;

    public ProductManager() {
    }

    public ProductManager(List<Product> listProduct) {
        this.listProduct = listProduct;
        this.scanner = new Scanner(System.in);
    }

    public boolean addProduct(Product product) {
        if (listProduct.contains(product)) return false;
        return listProduct.add(product);
    }

    public List<Product> deleteProductById(String id) {
        for (Product product : listProduct) {
            if (product.getId().equals(id)) {
                listProduct.remove(product);
                System.out.println("Delete successful!");
            } else {
                System.out.println("Our list of products is not contains this product!");
            }
        }
        
        return listProduct;
    }

    public List<Product> changePropertyProductById(String id) {
        for (Product product : listProduct) {
            if (product.getId().equals(id)) {
                System.out.print("Input your product price: ");
                int price = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Input your product name: ");
                String name = scanner.nextLine();
                
                Product newProduct = new Product(id, name, price);
                Collections.replaceAll(listProduct, product, newProduct);
                
                System.out.printf("Change old product %s with new product %s.\n", product.getName(), newProduct.getName());
            } else {
                System.out.println("Our list of products is not contains this product!");
            }
        }
        
        return listProduct;
    }

    public void findProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                System.out.printf("Product you want to find: %s", product);
                System.out.println();
            }
        }
    }

    public void sortingWithListProduct() {
        Collections.sort(listProduct, (Comparator.<Product>comparingDouble(product1 -> product1.getPrice())
                                .thenComparingDouble(product2 -> product2.getPrice())));
    }

    public void printListProduct() {
        listProduct.stream().map(s -> s.getName()).forEach(System.out::println);
        System.out.println("The current list of product: " + listProduct);
    }
}
