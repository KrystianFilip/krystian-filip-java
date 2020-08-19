package basics.collections.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/* TASK: Write a program using ArrayList that contains several grades from IT classes in high-school. Using for-loop calculate average,
excluding one outer good and one outer bad grade.
*/

public class ArrayListGradesAverage {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Random rg = new Random();
        int sum = 0;
        for(int n=0; n <20; n++) {
            grades.add(rg.nextInt(5) + 1);
        }
        Collections.sort(grades);
        System.out.println("Good grade removed: " + grades.get(19));
        System.out.println("Bad grade removed: " + grades.get(0));
        grades.remove(grades.size()-1);
        grades.remove(0);
        System.out.println(grades);
        for (Integer grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        System.out.println("The average after removal of two far left/right elements, equals : " +average);
    }
}
