package basics.collections.maps.grades;

import java.util.HashMap;
import java.util.Map;

/*TASK: Write a program that will store student's data and grades in a HashMap.
Program should display arithmetical average of each and every student included in a Map.*/
public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Krystek", "Filip", "95040472655");
        Student s2 = new Student("Prezes", "Pento", "97030212345");
        Student s3 = new Student("Iwan", "Pewlus", "95010232145");

        Grades g1 = new Grades(5.0,4.0,3.0,2.0,5.0);
        Grades g2 = new Grades(5.0,5.0,5.0,5.0,5.0);
        Grades g3 = new Grades(4.0,2.0,5.0,4.0,5.0);

        Map<Student,Grades> gradesMap = new HashMap<>();
        gradesMap.put(s1,g1);
        gradesMap.put(s2,g2);
        gradesMap.put(s3,g3);

        for (Map.Entry<Student,Grades> entry : gradesMap.entrySet()) {
            System.out.println("Average of: " + entry.getKey() + " equals: " + entry.getValue().getAverage());
        }
    }
}
