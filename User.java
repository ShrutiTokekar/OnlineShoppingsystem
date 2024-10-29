import java.util.HashMap;
import java.util.Scanner;

public class User {
    private static HashMap<String, User> userDatabase = new HashMap<>();
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static User registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        User user = new User(username, password);
        userDatabase.put(username, user);
        System.out.println("User registered successfully.");
        return user;
    }

    public static User loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = userDatabase.get(username);
        if (user != null && user.password.equals(password)) {
            System.out.println("Login successful.");
            return user;
        } else {
            System.out.println("Invalid credentials.");
            return null;
        }
    }
}
