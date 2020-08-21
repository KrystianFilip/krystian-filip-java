package basics.collections.queues.bookorders;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 Here we are gonna use a type of a queue called FIFO(First In First Out). Typically, the usage of this queue is
 connected to system cooperation, executing their tasks with different speed. In order to avoid delay caused by the
 slower system we are organising communication between them through the queue. Faster system queues up requests and
 slower one takes those objects and fulfills the request handling part.

 Basic operating interface, regardless the implementation, is imported by java.util and named Queue(JCF).
 As usual it is only a declaration of a contract - it defines the methods implemented by queue classes.
 However Queue interface itself is very broad - it does not allow us to choose or point from which side of the queue
 certain element will be taken. That's why java.util library discloses an extended, inherited interface Deque.
 It allows us to implement classes that will handle FIFO and LIFO queues.

 **/

/*In this example we are using ArrayDeque - one of the implementation classes of interface Deque. It is peculiar
 because we can use it to execute FIFO and LIFO(as a stack)*/
public class OrderQueueExample {
    public static void main(String[] args) {
        //Creating example books and orders and displaying them in console.
        Book theBook = new Book("Millionaire Habbits", "Brian Tracy", 2017);
        Order theOrder = new Order(theBook,2020,9,21);
        System.out.println(theOrder);
        System.out.println();
        //Adding more example books and order and creating a queue.
        Book theBook2 = new Book("Cujo", "Stephen King", 1989);
        Book theBook3 = new Book("Salem", "Stephen King", 1969);

        Order theOrder2 = new Order(theBook,2020,6,12);
        Order theOrder3 = new Order(theBook2,2020,4,15);
        Order theOrder4 = new Order(theBook3,2020,2,11);
        Order theOrder5 = new Order(theBook3,2020,1,27);

        //Creating a queue and checking it's size at the begining.
        Queue<Order> orderList = new ArrayDeque<>();
        System.out.println("Queue is created and it contains: " + orderList.size() + " positions.");
        orderList.add(theOrder);
        orderList.add(theOrder2);
        orderList.add(theOrder3);
        orderList.add(theOrder4);
        orderList.add(theOrder5);

        System.out.println("Queue is filled. Now it contains: " + orderList.size() + " positions.");
        System.out.println();

        //To examine what is the first position in the queue we are using .peek() method.
        System.out.println("Checking which order is set at first position:");
        System.out.println(orderList.peek());
        System.out.println();

        //To get an object from the queue we are creating a new Order object and using .poll() method.
        Order tempOrder;
        tempOrder = orderList.poll();
        System.out.println("Checking queue's size after taking out one object.\n" + "Queue contains: " +
                orderList.size() + " positions.");
        System.out.println();
        //Checking which order has been taken out first from the queue - surprise surprise it is the first object queued.
        System.out.println("Last order taken from queue is: \n" + tempOrder );

    }
}
