package Exercise2;

public class DatabaseAdmin extends Employee{

    private String dbTechnology;


    //dateOfBirth will be set using the Setter method .setDateOfBirth
    public DatabaseAdmin(String firstName, String lastName, String address,
                         String position, String dbTechnology) {
        super(firstName, lastName, address, position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }
}
