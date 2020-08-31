package stream.basicexamples;

public class MainApp {
    public static void main(String[] args) {
        Person.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0,1).equalsIgnoreCase("m"))
                .forEach(System.out::println);
    }
}
