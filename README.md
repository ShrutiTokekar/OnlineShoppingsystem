The Online Shopping System is a Java application designed to provide an interactive platform for online shopping. Users can register, browse products, manage their shopping carts, and process orders, all through a console-based interface. The system implements object-oriented programming principles, enhancing data management and user interaction.

Main.java: This is the entry point of the application, where users can navigate through various options like registering, logging in, viewing products, and managing their cart. It orchestrates user interactions and invokes methods from other classes.

Product.java: This class defines the product entity, storing product details such as ID, name, and price. It includes methods for displaying available products and retrieving products by their ID, allowing users to interact with the product catalog.

User.java: This class handles user registration and authentication. It maintains a static database of users, providing methods for registering new users and verifying login credentials to ensure secure access to the system.

ShoppingCart.java: This class manages the shopping cart functionality, allowing users to add products, view cart contents, and clear the cart. It provides methods to interact with the cart items, making the shopping experience seamless.

Order.java: This class processes orders, calculating the total cost of items in the cart and providing a summary of the transaction. It ensures that orders are handled correctly and communicates with the user about their order status.

Together, these components create a cohesive online shopping system that effectively manages user data and product information, providing a user-friendly shopping experience.
