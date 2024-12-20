public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.50, 10);
        Product product2 = new Product("Smartphone", 799.99, 20);
        Product product3 = new Product("Laptop", 1200.50, 5);

        Shopper shopper1 = new Shopper("alisher", "alisher123@gmail.com", "xxx xxxx xxxx");
        Shopper shopper2 = new Shopper("yerassyl", "george@gmail.com", "yyyy yyyy yyyyy");

        Order order1 = new Order(shopper1, product1, 2);
        Order order2 = new Order(shopper2, product2, 1);
        Order order3 = new Order(shopper1, product1, 3);

        product1.displayProduct();
        product2.displayProduct();

        shopper1.displayShopper();
        shopper2.displayShopper();

        order1.displayOrder();
        order2.displayOrder();
        order3.displayOrder();

        System.out.println("\nComparing product1 and product3: " + product1.equals(product3));
        System.out.println("\nComparing shopper1 and shopper2: " + shopper1.equals(shopper2));
        System.out.println("\nComparing order1 and order3: " + order1.equals(order3));
    }
}