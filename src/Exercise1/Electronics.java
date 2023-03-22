package Exercise1;

public class Electronics extends Product{

    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;


    //Description and quantity will be set by calling the Setters from the Product superclass.

    public Electronics(double price, String name, String type,
                       double length, double width, double height, double weight) {
        super(price, name);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                "} ";
    }
}
