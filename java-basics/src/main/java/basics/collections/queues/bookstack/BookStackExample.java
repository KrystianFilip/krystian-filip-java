package basics.collections.queues.bookstack;


import java.util.ArrayDeque;
import java.util.Queue;

/*TASK: Write a program which creates a stack of five books, checks stacks size, removes all the books, checks
       size of the stack again and displays which book were removed last.*/
public class BookStackExample {
    public static void main(String[] args) {
       Book b1 = new Book("Stephen King", "Cujo", 1999);
       Book b2 = new Book("Stephen King", "Outsider", 2017);
       Book b3 = new Book("Stephen King", "Mr.Mercedes", 2014);
       Book b4 = new Book("Stephen King", "Finder's Keeper's", 2017);
       Book b5 = new Book("Harry Craddock", "Savoy Cocktail Book", 1987);

        ArrayDeque<Book> bookStack = new ArrayDeque<Book>();
        System.out.println("Stack created. Size: " + bookStack.size());
        bookStack.push(b1);
        bookStack.push(b2);
        bookStack.push(b3);
        bookStack.push(b4);
        bookStack.push(b5);
        System.out.println("Stack filled. Size: " + bookStack.size());

        Book removed;
        removed = bookStack.pop();
        removed = bookStack.pop();
        removed = bookStack.pop();
        removed = bookStack.pop();
        removed = bookStack.pop();

        System.out.println("Stack cleared. Size: " + bookStack.size());
        System.out.println("The last book removed from stack was: " + removed);

    }
}
