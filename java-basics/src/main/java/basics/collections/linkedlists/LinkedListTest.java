package basics.collections.linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        /* >>LinkedList<< implements >>List<< that extends interface >>Collection<< that extends >>Iterable<<. It differs
        from ArrayList because its elements are like railway carriages that remember the references to other carriages in the
        collection. From the LinkedList's point of view the most important thing is to remember to which carriages certain element
        is connected so all the removal or addition operations can be executed quickly. */

        List<String> list = new LinkedList<>();
        list.add(0, "Zero");
        list.add(1, "One");
        list.add(2, "Two");
        list.add(3, "Three");
        list.add(4, "Four");
        list.add(5, "Five");
        list.add(6, "Six");
        list.add(7, "Seven");
        list.add(8, "Eight");
        list.add(9, "Nine");
        list.add(10, "Ten");

        // Retrieve and display an element at index 7
        System.out.println("Element list(7) = " + list.get(7));
        //We can assign value of the >>8th<< element of the list to the String variable like this:
        String eightPositionBecauseWeHaveToRememberAboutIndexZero = list.get(7);
        System.out.println(eightPositionBecauseWeHaveToRememberAboutIndexZero);
        /* In order to reach desired list's element, program has to start from the very beginning of the collection and
        iterate through the entire list until it finds exact index number - it shows us that iteration in this case is much more
        longer than iteration through an array list. */
        List<Integer> theBigList = new LinkedList<>();
        for(int n=0; n < 1000; n++) {
            theBigList.add(n*2);
        }
        System.out.println("Index at 955 shows: " + theBigList.get(955));
        System.out.println("And our collection contains: " + theBigList.size() + " elements.");
        /* Using the Big-O Notation to estimate computational complexity in this case we can establish that LinkedList's data
         read is in order of O(n) - it is linearly dependant on collection's size (it will always iterate through entire collection). */
        //In order to add a new element to the list we are unhooking chains of the carriages and changing the references to the list's elements.
        theBigList.add(955,500);
        System.out.println("Index at 955 now shows: " + theBigList.get(955));
        System.out.println("And new size of our collections contains: " + theBigList.size() + " elements.");
        /*Removal is pretty much the same - unhooking and changing the references. It is built in the methods so we don't have to worry
        about it. Operation duration time is always the same - whether we are removing the first or the last element from the list. */
        System.out.println("Removing element with index 955.");
        theBigList.remove(955);
        System.out.println("So now we are back to the start and index 955 shows: " + theBigList.get(955));
        System.out.println("And our collection contains: " + theBigList.size() + " elements.");

        /* Hey dummy! Use this list when you are often adding/removing something to/from the collection and rarely reading the index numbers */

    }
}

