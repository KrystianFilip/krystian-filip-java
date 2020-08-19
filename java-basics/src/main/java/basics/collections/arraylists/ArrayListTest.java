package basics.collections.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> movieLibrary = new ArrayList<>();
        /*We are creating a new >>ArrayList<< that implements >>List<< interface which extends >>Collection<< interface
        which extends >>Iterable<< interface. It also uses its basic methods such ass "add" or "remove" and allows to use loops
        in the implementation. */

        movieLibrary.add("50 shades of Grey");
        movieLibrary.add("Sherlock Holmes");
        movieLibrary.add("The Last Mohikan");
        movieLibrary.add("The Infinity");
        movieLibrary.add("Better Call Soul");
        movieLibrary.add("A Journey Into the Earth");
        movieLibrary.add("Binary Death");
        movieLibrary.add("Breaking Bad");
        movieLibrary.add("50000 Miles Undersea Journey");
        movieLibrary.add("The Titanfall");
        movieLibrary.add("Coma");
        movieLibrary.add("People and Ants");
        movieLibrary.add("To understand the Woman");
        movieLibrary.add("Never-ending Story");
        movieLibrary.add("Book of Jungle");
        /* Method .size() returns the actual size of our collection.*/
        System.out.println(movieLibrary.size());
        /* Method .get(int index) allows us to read the data that is assigned to list's index number. So we can easily iterate
         through our little database and read all the elements using "for" loop.*/
        for (int n = 0; n < movieLibrary.size(); n++) {
            System.out.println("Element " + n + " of the movie library is: " + movieLibrary.get(n));
        }
        /* We can also use "for each" loop and iterate without any follow ups to the loop control variable. It simply calls each
         object in the collection. */
        for (String movie : movieLibrary) {
            System.out.println("Element of the movie library is: " + movie);
        }
        /* To remove an element from our collection we are using method .remove(int index) - e.g to remove the last element of
        this particular collection one must type .remove(array.size()-1) */
        System.out.println("Collection contains: " + movieLibrary.size() + " movies.");
        System.out.println("Removing the last element from the collection...");
        movieLibrary.remove(movieLibrary.size()-1);
        System.out.println("Collection after removal contains: " + movieLibrary.size() + " movies.");
        for (String movie : movieLibrary) {
            System.out.println(movie);
        }
        /* Method .add(Object o) also has another two-parameter form .add(int index, Object o) that allows us to add an object
        at the certain place in the collection.*/
        System.out.println();
        System.out.println("Adding Cujo to the Collection");
        movieLibrary.add(0, "Cujo");
        System.out.println("First position of this collection is: " + movieLibrary.get(0));
        for (String movie : movieLibrary) {
            System.out.println(movie);
        }
        System.out.println(movieLibrary.size());
    }
    /* It is a good practice to use an ArrayList when we are operating on small data bases and we are unlikely to remove elements
    from the middle of it. Because when we are removing object with index "n" each and every element (n+1, n+2...) on the further
    positions must be moved by one position moving to the top. Therefore when we are removing the first element from our collection
    whole inner collection is being copied - this could be devastatingly long while operating on bigger collections.*/
}
