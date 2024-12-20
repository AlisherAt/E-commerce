public class Order {private Shopper shopper;
    private Product product;
    private int quantity;

    public Order(Shopper shopper, Product product, int quantity) {
        this.shopper = shopper;
        this.product = product;
        this.quantity = quantity;
    }

    public Shopper getShopper() {
        return shopper;
    }

    public void setShopper(Shopper shopper) {
        this.shopper = shopper;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayOrder() {
        System.out.println("Order: ");
        shopper.displayShopper();
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + (product.getPrice() * quantity));
    }

    public boolean equals(Order other) {
        return this.shopper.getEmail().equals(other.shopper.getEmail()) && this.product.getProductName().equals(other.product.getProductName());
    }
}
