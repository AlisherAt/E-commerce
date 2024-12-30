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
        System.out.println("Shopper Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    @Override
    public String toString() {
        return "Shopper{name='" + name + "', email='" + email + "', phone='" + phoneNumber + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shopper shopper = (Shopper) obj;
        return email.equals(shopper.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
