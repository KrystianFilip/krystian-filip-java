package basics.validator;

public class MainApp {
    public static void main(String[] args) {

        User user1 = new User(18,'m', "Poland");
        User user2 = new User(15,'s', "Belarus");

        UserValidator validator = new UserValidator();
        validator.validateAge(user1.getAge());
        validator.validateSex(user1.getSex());
        validator.validateCountry(user1.getCountry());
        System.out.println();
        validator.validateAge(user2.getAge());
        validator.validateSex(user2.getSex());
        validator.validateCountry(user2.getCountry());
    }
}
