package Exercise2;

import java.time.LocalDate;

public class Exercise3 {

    private int age;
    private LocalDate ageLD;

    LocalDate currentDate = LocalDate.of(2023, 3, 22);

    public String getFullName (String firstName, String lastName) {
        return "Full name is " + firstName + " " + lastName;
    }

    //am verificat in oglinda sa vad daca am peri albi :))
    //m-a agitat ceva vreme metoda asta, pana sa ii dau de cap
    public int ageGetter (LocalDate birthDate){
       ageLD = currentDate.minusYears(birthDate.getYear());
       age = ageLD.getYear();
       return age;


    }
}
