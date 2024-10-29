import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> cartItems = new ArrayList<>();

    public void addProduct(Product product) {
        if (product != null) {
            cartItems.add(product);
            System.out.println(product.getName() + " added to cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void viewCart() {
        System.out.println("Shopping Cart:");
        for (Product product : cartItems) {
            System.out.printf("ID: %d, Name: %s, Price: $%.2f%n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void clearCart() {
        cartItems.clear();
        System.out.println("Cart cleared.");
    }
}
