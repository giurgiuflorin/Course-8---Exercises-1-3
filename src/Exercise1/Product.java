package Exercise1;

public class Product {

    private double price;
    private String name;
    private String description;
    private int quantity;

    //It is required to set the name and price of the product when creating the object.
    //All the other characteristics of the product will be set using the Setters.
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
         return quantity;
    }
}
