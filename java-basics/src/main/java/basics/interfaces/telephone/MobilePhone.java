package basics.interfaces.telephone;

public class MobilePhone implements Telephone {
    @Override
    public void callTo(String name) {
        System.out.println("Calling to: " + name);

    }
}
