package basics.collections.sets.employee;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    String name;
    String surname;
    LocalDate birthDate;

    public Employee(String name, String surname, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.surname = surname;
        /* A class LocalDate provided by java.time library is used to store dates. We are
          initializing three additional variables in a constructor. */
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(birthDate, employee.birthDate);
    }

    @Override
    public int hashCode() {
        return birthDate.getYear() * 100 + birthDate.getMonthValue();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + birthDate + ")";
    }
}
