package basics.loops.whileloop;

import java.util.Random;

public class SumRace {
    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        Random rg = new Random();

        int iteration = 0;

        while(sumA > sumB) {
            iteration++;
            int x = rg.nextInt(9);
            sumA += x;
            int y = rg.nextInt(49);
            sumB += y;
            System.out.println("Iteration #" + iteration + " |" + "x = " + x + " | y = " + y + "|\n"
            + "| SumA: " + sumA + " | SumB: " + sumB + "|");
        }
    }
}
