public class Order {
    public static void processOrder(User user, ShoppingCart cart) {
        System.out.println("Processing order for " + user.getUsername());
        double total = 0;
        for (Product product : cart.getItems()) {
            total += product.getPrice();
        }
        System.out.printf("Total amount: $%.2f%n", total);
        System.out.println("Order placed successfully!");
    }
}
