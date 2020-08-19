package basics.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageCalculation {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Random rg = new Random();
        int sum = 0;
        for (int i=0;i<20;i++) {
        grades.add(rg.nextInt(5) + 1);
        sum += grades.get(i);
        }
        System.out.println(grades);
        double average = sum / grades.size();
        System.out.println(average);
    }
}
