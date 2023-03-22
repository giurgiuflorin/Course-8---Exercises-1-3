package Exercise1;

public class Fridge extends  Electronics{

    private double temperature;
    private final double MAX_TEMPERATURE = 18;
    private final double MIN_TEMPERATURE = -10;

    //Description and quantity will be set by calling the Setters from the Product superclass.

    public Fridge(double price, String name, String type,
                  double length, double width, double height, double weight, double temperature) {
        super(price, name, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public double getTemperature() {
        System.out.println("Current temperature is: " + temperature +" celsius degrees.");
        return temperature;
    }

    public double setTemperature(double temperature) {
        if (temperature > MAX_TEMPERATURE) {
            System.out.println("The temperature can only be set up to "
                    + MAX_TEMPERATURE + " celsius degrees!");
            return -1;
        }
        if (temperature < MIN_TEMPERATURE) {
            System.out.println("The temperature can only be set down to "
                    + MIN_TEMPERATURE + " celsius degrees!");
            return -1;

        }
        System.out.println("The temperature has been set to: " + temperature);
        this.temperature = temperature;
        return temperature;
    }
}
