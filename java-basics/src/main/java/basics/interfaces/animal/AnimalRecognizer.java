package basics.interfaces.animal;

public class AnimalRecognizer {
    public String recognize(Animal animal) {
        return "This is: " + animal.name() + ", because this shit goes: "
                + animal.voice() + " All the goddamn time...";
    }
}
