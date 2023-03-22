package Exercise2;

public class Programmer extends Employee{

    private String language;

    //dateOfBirth will be set using the Setter method .setDateOfBirth

    public Programmer(String firstName, String lastName, String address, String position, String language) {
        super(firstName, lastName, address, position);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
