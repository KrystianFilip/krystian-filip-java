package lambda.beautifier;

public class PoemBeautifier {
    public String beautify(String string,PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(string);
        return result;
    }

    public static String toUpperCase(String string) {
        return string.toUpperCase();
    }
    public static String toLowerCase(String string) {
        return string.toLowerCase();
    }
    public static String addSomeCrazySigns(String string) {
        return "@#$%^&*()(*&^%$#" + string + "@#$%^&*))(*&^$@";
    }
}
