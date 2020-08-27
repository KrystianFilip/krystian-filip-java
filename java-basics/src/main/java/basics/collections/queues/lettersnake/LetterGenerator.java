package basics.collections.queues.lettersnake;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Random;

public class LetterGenerator {
    public static void main(String[] args) {
        String a = "a";
        String sumA = "a";
        int sumOfAs= 0;
        Random rg = new Random();
        ArrayDeque<String> aaaaaaa = new ArrayDeque<>();
        while(aaaaaaa.size() < 50) {
            sumOfAs = rg.nextInt(51);
            if(sumOfAs != 0) {
                for (int i=0;i<sumOfAs;i++){
                    sumA += a;
                }
                aaaaaaa.add(sumA);
            }
            System.out.println(aaaaaaa);
        }
    }
}
