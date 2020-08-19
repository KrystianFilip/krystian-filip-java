package basics.interfaces.telephone;

public interface Telephone {
    void callTo(String name);
    default void callToMom() {
        System.out.println("I am calling mother.");
    }
    static String call911() {
        return "Calling: 911 [emergency]";
    }
}
