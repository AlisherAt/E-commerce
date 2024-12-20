public class Product {private String productName;
    private double price;
    private int stock;

    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName + ", Price: $" + price + ", Stock: " + stock);
    }

    public boolean equals(Product other) {
        return this.productName.equals(other.productName);
    }
}
