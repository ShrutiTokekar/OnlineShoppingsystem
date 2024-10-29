import java.util.ArrayList;

public class Product {
    private static int idCounter = 1;
    private static ArrayList<Product> productList = new ArrayList<>();
    private int id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        productList.add(this);
    }

    public static void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : productList) {
            System.out.printf("ID: %d, Name: %s, Price: $%.2f%n", product.id, product.name, product.price);
        }
    }

    public static Product getProductById(int id) {
        for (Product product : productList) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }
}
