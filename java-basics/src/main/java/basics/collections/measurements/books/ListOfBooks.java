package basics.collections.measurements.books;

import java.util.LinkedList;

public class ListOfBooks {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        for (int i = 0; i < 6000000; i++) {
            books.add(new Book("Stephen King", "Cujo"));
        }
        System.out.println(books.size());
        long startingPoint = System.nanoTime();
        books.remove(5999999);
        long endingPoint = System.nanoTime();
        System.out.println("Removal of last element: " + (endingPoint - startingPoint) + " ns");

        startingPoint = System.nanoTime();
        books.remove(0);
        endingPoint = System.nanoTime();
        System.out.println("Removal of first element: " + (endingPoint - startingPoint) + " ns");
    }
}
