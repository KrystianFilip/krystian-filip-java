package basics.interfaces.animal;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meow, meow!";
    }

    @Override
    public String name() {
        return "Soulless creature";
    }
}
