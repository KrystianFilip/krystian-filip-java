package basics.collections.linkedlists;

import java.util.LinkedList;
import java.util.List;
/*TASK: Write a program using LinkedList that contains references to the objects describing books in library.
        Then filter them to find those with publication year exceeding year 2000. */
public class BookList {
    public static void main(String[] args) {
        List<Book> bookList = new LinkedList<>();
        bookList.add(new Book("Stephen King", "Cujo", 1996));
        bookList.add(new Book("Stephen King", "IT", 1991));
        bookList.add(new Book("Stephen King", "Outsider", 2017));
        bookList.add(new Book("Stephen King", "Salem", 1988));
        bookList.add(new Book("Stephen King", "Mr. Mercedes", 2012));

        for (Book book : bookList) {
            if( book.getPublicationYear() > 2000) {
                System.out.println(book);
            }
        }

    }
}
