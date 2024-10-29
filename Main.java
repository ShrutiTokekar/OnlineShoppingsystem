import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        User user = null;

        while (true) {
            System.out.println("\n--- Online Shopping System ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Products");
            System.out.println("4. Add to Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    user = User.registerUser(scanner);
                    break;
                case 2:
                    user = User.loginUser(scanner);
                    break;
                case 3:
                    Product.displayProducts();
                    break;
                case 4:
                    System.out.print("Enter product ID to add to cart: ");
                    int productId = scanner.nextInt();
                    cart.addProduct(Product.getProductById(productId));
                    break;
                case 5:
                    cart.viewCart();
                    break;
                case 6:
                    Order.processOrder(user, cart);
                    cart.clearCart();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
