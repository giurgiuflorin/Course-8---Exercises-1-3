package Exercise2;

public class Main {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer("Marin", "Umbrescu", "Brasov, 5524",
                "Entry-level", "JAVA");
        programmer1.setDateOfBirth(12, 12, 1998);
        programmer1.setDateOfEmployment(2017, 5, 14);
        System.out.println(programmer1.getPosition());
        System.out.println(programmer1.getBirthday());
        System.out.println(programmer1.getAddress());

        System.out.println(); //just to put an empty line in console

        DatabaseAdmin dAdmin = new DatabaseAdmin("Raul", "Muntean", "Iasi, 232",
                "Mid-Level", "SQL");
        dAdmin.setDateOfBirth(14, 2, 1991);
        System.out.println(dAdmin.getBirthday());
        System.out.println(dAdmin.getAddress());


        //Exercise 3
        //putem obtine numele complet folosind metoda getFullName din
        //clasa Exercise3 si dand celor doi parametrii valorile necesare de la obiectul
        //din clasa DatabaseAdmin (in acest caz, dAdmin fiind obiectul)

        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.getFullName(dAdmin.firstName, dAdmin.lastName));

        //metoda ageGetter are ca parametru data de nastere a obiectului dAdmin (obtinuta prin .getBirthday)
        //metoda se foloseste de un field privat (ageLD) caruia ii atribuie valoarea rezultata din ecuatia
        //de scadere dintre doua variabile LocalDate [currentDate - birthDate(parametru caruia ii dam valoarea obiectului dAdmin)]
        //apoi folosind metoda .getYear() din clasa LocalDate, atribui anul unei variabile Integer si returnam aceasta variabila.

        System.out.println(exercise3.ageGetter(dAdmin.getBirthday()));

        

    }
}
