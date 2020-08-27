package basics.collections.linkedlists.uniquelist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class UniqueTest {
    public static void main(String[] args) {
        //creating the list and filling it up with random numbers from 0-100;
        LinkedList<MyObject> listOfNumbers = new LinkedList<>();
        Random rg = new Random();
        for(int i=0;i<100;i++) {
            listOfNumbers.add(new MyObject(rg.nextInt(100)));
        }
        //checking for duplicates
        Iterator<MyObject> iterator = listOfNumbers.iterator();
        while(iterator.hasNext()) {
            MyObject examinedObject = iterator.next();

            for (int o=0;o<listOfNumbers.size();o++) {
                if(listOfNumbers.get(o).hashCode() != examinedObject.hashCode()) {
                    if(listOfNumbers.get(o).equals(examinedObject)) {
                        System.out.println("Duplicated: " + examinedObject.getValue());
                    }
                }
            }
        }
    }
}
