import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 1200.50, 10);
        Product product2 = new Product("Smartphone", 799.99, 20);
        Product product3 = new Product("Laptop", 1200.50, 5);

        Shopper shopper1 = new Shopper("Alisher", "alisher123@gmail.com", "xxx xxxx xxxx");
        Shopper shopper2 = new Shopper("Yerassyl", "george@gmail.com", "yyyy yyyy yyyy");

        Order order1 = new Order(shopper1, product1, 2);
        Order order2 = new Order(shopper2, product2, 1);
        Order order3 = new Order(shopper1, product1, 3);

        System.out.println(product1);
        System.out.println(product2);

        System.out.println(shopper1);
        System.out.println(shopper2);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("\nComparing product1 and product3: " + product1.equals(product3));
        System.out.println("Comparing shopper1 and shopper2: " + shopper1.equals(shopper2));
        System.out.println("Comparing order1 and order3: " + order1.equals(order3));

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        System.out.println("\nSorted Products by Price:");
        productList.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .forEach(System.out::println);
    }
}
