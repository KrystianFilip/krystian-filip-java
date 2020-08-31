package lambda.beautifier;

public class MainApp {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();
        String b1 = beautifier.beautify("Hello World!", string -> "XXX" + string + "XXX");
        String b2 = beautifier.beautify("Hello World!", string -> string.toLowerCase());
        String b3 = beautifier.beautify("Hello World!", string -> string.toUpperCase());
        String b4 = beautifier.beautify("Hello World!", string -> string.replaceAll("l","x"));
        String b5 = beautifier.beautify("Hello World!", string -> string.replaceFirst("H", "X"));
        String b6 = beautifier.beautify("Hello World!", string -> string.replace("Hello","Poop"));

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        String ref1 = beautifier.beautify("Skrrrrrrt ZygaZyguZiiig", PoemBeautifier::toUpperCase);
        System.out.println(ref1);
        String ref2 = beautifier.beautify("Skrrrrrrt ZygaZyguZiiig", PoemBeautifier::addSomeCrazySigns);
        System.out.println(ref2);
    }
}
