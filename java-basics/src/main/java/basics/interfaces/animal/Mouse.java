package basics.interfaces.animal;

public class Mouse implements Animal {
    @Override
    public String voice() {
        return "Squeak, squeak!";
    }

    @Override
    public String name() {
        return "Twitch";
    }
}
