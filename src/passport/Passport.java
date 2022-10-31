package passport;

import java.time.LocalDate;

public class Passport {
    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;

    private final LocalDate localDate;

    public Passport(int number, String lastName, String name, String middleName, LocalDate localDate) {
        if (number <= 0 || lastName == null || lastName.isBlank() || name == null || name.isBlank() || localDate == null){
            throw new IllegalArgumentException("Недостаточно данных");
        } else {
            this.number = number;
            this.lastName = lastName;
            this.name = name;
            this.middleName = middleName;
            this.localDate = localDate;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
