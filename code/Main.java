import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();
        List<Shopper> shopperList = new ArrayList<>();
        List<Order> orderList = new ArrayList<>();

        System.out.println("Enter number of products you want to add:");
        int productCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < productCount; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter product stock quantity: ");
            int stock = scanner.nextInt();
            scanner.nextLine(); 

            Product product = new Product(productName, price, stock);
            productList.add(product);
        }

     
        System.out.println("\nEnter number of shoppers you want to add:");
        int shopperCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < shopperCount; i++) {
            System.out.println("\nEnter details for Shopper " + (i + 1));
            System.out.print("Enter shopper name: ");
            String shopperName = scanner.nextLine();
            System.out.print("Enter shopper email: ");
            String email = scanner.nextLine();
            System.out.print("Enter shopper phone number: ");
            String phoneNumber = scanner.nextLine();

            Shopper shopper = new Shopper(shopperName, email, phoneNumber);
            shopperList.add(shopper);
        }

        System.out.println("\nEnter number of orders you want to add:");
        int orderCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < orderCount; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.println("Select shopper from the list:");
            for (int j = 0; j < shopperList.size(); j++) {
                System.out.println((j + 1) + ". " + shopperList.get(j));
            }
            int shopperIndex = scanner.nextInt() - 1;
            scanner.nextLine(); 
            Shopper selectedShopper = shopperList.get(shopperIndex);

            System.out.println("Select product from the list:");
            for (int j = 0; j < productList.size(); j++) {
                System.out.println((j + 1) + ". " + productList.get(j));
            }
            int productIndex = scanner.nextInt() - 1;
            scanner.nextLine(); 
            Product selectedProduct = productList.get(productIndex);

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            Order order = new Order(selectedShopper, selectedProduct, quantity);
            orderList.add(order);
        }


        System.out.println("\nDisplaying all orders:");
        for (Order order : orderList) {
            order.displayOrder();
        }

        scanner.close();
}
