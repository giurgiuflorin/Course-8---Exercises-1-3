package Exercise1;

public class Cosmetics extends Product {

    private String color;
    private double weight;

    //Description and quantity will be set by calling the Setters from the Product superclass.
    //Only 3 choices of color that can be set by using the Setter method form this class.
    public Cosmetics(double price, String name, double weight) {
        super(price, name);
        this.weight = weight;
    }

    public String setColor(String color) {
        switch (color) {
            case "red" -> this.color = "red";
            case "brown" -> this.color = "brown";
            case "pink" -> this.color = "pink";
            default -> System.out.println("Only red, brown and pink colors are possible");
        }
        return "Only red, brown and pink colors are possible";
    }

    public String getColor() {
        return color;
    }
}
