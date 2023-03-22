package Exercise2;

import java.time.LocalDate;

public class Employee implements Person {

    protected String firstName;
    protected String lastName; //using protected access modifier so that this field could
                               // be accessed by Exercise3 Class
    private LocalDate dateOfBirth;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;

    //dateOfBirth will be set using the Setter method .setDateOfBirth

    public Employee(String firstName, String lastName, String address, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.position = position;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //this method takes three integers and passes them to a LocalDate object.
    //then, the dateOfBirth field is given the value of the LocalDate object.
    //nu stiu daca metoda asta este cea mai pertinenta; pe internet am gasit metoda de a instantia un obiect de
    //tip LocalDate pentru a procesa date calendaristice.
    public void setDateOfBirth(int day, int month, int year) {
        LocalDate dateOB = LocalDate.of(year, month, day);
        dateOfBirth = dateOB;
    }

    public void setDateOfEmployment(int year, int month, int day) {
        LocalDate dateOF = LocalDate.of(year, month, day);
        dateOfEmployment = dateOF;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return dateOfBirth;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
