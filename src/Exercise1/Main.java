package Exercise1;

public class Main {
    public static void main(String[] args) {
        Cosmetics lipstick = new Cosmetics(8.00, "Lipstick 2023 version", 0.1);
        lipstick.setColor("blue"); //switch case in action;
        System.out.println(lipstick.getColor()); //the color was not set because the switch case acted on default;
        lipstick.setColor("red");
        lipstick.setQuantity(150);
        lipstick.setDescription("This lipstick has a transfer-resistant formula and lasts all day.");
        System.out.println(lipstick.getDescription());


        Fridge houseFridge = new Fridge(145.75, "SuperFridge 2023", "Class A", 1,
                1, 2, 50, 0);
        houseFridge.setDescription("The new fridge model has a wider temperature range.");
        houseFridge.setQuantity(8);
        System.out.println(houseFridge.getDescription());
        System.out.println(houseFridge.toString());
        houseFridge.setTemperature(-5);
        houseFridge.getTemperature();
        houseFridge.setTemperature(-14); //if case in action;
        houseFridge.setTemperature(33); //if case in action;
        houseFridge.setTemperature(-3);


        Electronics electricProduct = new Electronics(145.00, "Prototype", "Class B", 2, 2, 2, 2);
        System.out.println(electricProduct.toString());



    }
}