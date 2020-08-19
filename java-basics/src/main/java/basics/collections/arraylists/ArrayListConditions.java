package basics.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConditions {
    public static void main(String[] args) {
        //Creating and filling the list with users first names.
        List<String> userNames = new ArrayList<>();
        userNames.add("Jennifer");
        userNames.add("Kimberly");
        userNames.add("Nicole");
        userNames.add("Amy");
        userNames.add("Sarah");
        userNames.add("Brandon");
        userNames.add("Robert");
        userNames.add("Ken");
        userNames.add("Jack");
        //Using for-each loop - displaying names, which are no longer than 5 chars.
        for (String name : userNames) {
            if (name.length() < 5) {
                System.out.println(name);
            }
        }
    }
}
