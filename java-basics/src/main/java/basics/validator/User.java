package basics.validator;

public class User {
    int age;
    char sex;
    String country;

    public User(int age, char sex, String country) {
        this.age = age;
        this.sex = sex;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }
}
