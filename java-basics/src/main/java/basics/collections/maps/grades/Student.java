package basics.collections.maps.grades;

import java.util.Objects;
public class Student {
    String name;
    String surname;
    String peselId;

    public Student(String name, String surname, String peseId) {
        this.name = name;
        this.surname = surname;
        this.peselId = peseId;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(peselId, student.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peselId);
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + peselId + ")";
    }
}
