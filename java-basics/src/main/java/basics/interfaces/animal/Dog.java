package basics.interfaces.animal;

public class Dog implements Animal {
    @Override
    public String voice() {
        return "Woof woof!";
    }

    @Override
    public String name() {
        return "Doggo";
    }
}
