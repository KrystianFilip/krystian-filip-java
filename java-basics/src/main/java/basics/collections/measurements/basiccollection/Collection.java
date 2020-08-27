package basics.collections.measurements.basiccollection;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n = 0; n < 10000000; n++) {
            list.add(n);
        }
        System.out.println("Collection's size: " + list.size());
        //Removing time of the last element.
        long start = System.currentTimeMillis();
        list.remove(list.size() -1);
        long end = System.currentTimeMillis();
        //check:
        System.out.println("Removing time of the last element of the list took: " + (end - start) + " ms");
        //Removing time of the first element.
        start = System.currentTimeMillis();
        list.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Removing time of the first element of the list took: " + (end - start) + " ms");
        //Adding new element at the end of the collection.
        start = System.nanoTime();
        list.add(list.size());
        end = System.nanoTime();
        System.out.println("Adding new element at the end of the collection took: " + (end - start) + "ns");
        //Adding element at the start of the collection.
        start = System.nanoTime();
        list.add(0,list.size());
        end = System.nanoTime();
        System.out.println("Adding new element at the start took: " + (end - start) + "ns");
    }
}
