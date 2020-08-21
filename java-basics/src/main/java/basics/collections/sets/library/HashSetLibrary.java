package basics.collections.sets.library;

import java.util.HashSet;
import java.util.Set;

/*TASK: Write a program that will store in a HashSet objects representing books in a library.
        Each book should have title,author and publication year (as well as hashCode and equals method).
        Using for-each loop print in console all the book titles that were published before 2010.*/
public class HashSetLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Stephen King", "Cujo", 1999);
        Book b2 = new Book("Stephen King", "Outsider", 2017);
        Book b3 = new Book("Stephen King", "Mr.Mercedes", 2014);
        Book b4 = new Book("Stephen King", "Finder's Keeper's", 2017);
        Book b5 = new Book("Harry Craddock", "Savoy Cocktail Book", 1987);
        Book b6 = new Book("Brian Tracy", "Millonaire's Habbits", 2015);
        Book b7 = new Book("Stieg Larsson", "The Girl With The Dragon Tattoo", 2011);
        Book b8 = new Book("Stephen King", "Salem", 1988);
        Book b9 = new Book("Michail Bulhakow", "Dog's Heart", 1966);
        Book b10 = new Book("Stephen King", "IT", 1984);

        Set<Book> bookLibrary = new HashSet<>();
        bookLibrary.add(b1);
        bookLibrary.add(b2);
        bookLibrary.add(b3);
        bookLibrary.add(b4);
        bookLibrary.add(b5);
        bookLibrary.add(b6);
        bookLibrary.add(b7);
        bookLibrary.add(b8);
        bookLibrary.add(b9);
        bookLibrary.add(b10);

        for (Book theBook : bookLibrary) {
            if (theBook.getPublicationYear() < 2010) {
                System.out.println(theBook);
            }
        }
    }
}
