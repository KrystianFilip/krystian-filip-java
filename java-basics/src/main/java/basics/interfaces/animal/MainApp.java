package basics.interfaces.animal;

public class MainApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal mouse = new Mouse();

        AnimalRecognizer recognizer = new AnimalRecognizer();
        String result = recognizer.recognize(cat);
        System.out.println(result);
        String result2 = recognizer.recognize(dog);
        System.out.println(result2);
        String result3 = recognizer.recognize(mouse);
        System.out.println(result3);
    }
}
