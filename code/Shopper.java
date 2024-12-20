public class Shopper {
    private String name;
    private String email;
    private String phoneNumber;

    public Shopper(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayShopper() {
        System.out.println("Shopper: " + name + ", Email: " + email + ", Phone: " + phoneNumber);
    }

    public boolean equals(Shopper other) {
        return this.email.equals(other.email);
    }
}
