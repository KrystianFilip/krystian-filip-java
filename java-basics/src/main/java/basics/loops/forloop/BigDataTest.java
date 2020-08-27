package basics.loops.forloop;

import java.util.ArrayList;
import java.util.Random;

public class BigDataTest {
    public void printEven(ArrayList<Integer> theBigList) {
        int tempVal = 0;
        for(int n=0;n<theBigList.size();n++) {
            tempVal = theBigList.get(n);
            if(tempVal % 2 == 0) {
                System.out.println(tempVal);
            }
        }
    }

    public static void main(String[] args) {
        //Creating an ArrayList with integer objects and random number generator that will quickly fill our list.
        ArrayList<Integer> theBigList = new ArrayList<>();
        Random rg = new Random();
        //Thanks to for loop we are iterating 2mln times, each time adding new random integer(1-50000) to the list.
        //Types are different (Integer/int) but no worries - wrapper is converting those types on the fly.
        for(int i=0;i < 2000000; i++) {
            theBigList.add(rg.nextInt(50000));
        }
        //When the loop is closed we can check our collection's size using method .size() .
        System.out.println(theBigList.size());
        //Creating an instantion of class BigDataTest to use .printEven() method.
        BigDataTest evenPrinter = new BigDataTest();
        evenPrinter.printEven(theBigList);
    }

}
