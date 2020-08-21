package basics.collections.queues.bookorders;

import java.time.LocalDate;

public class Order {
    Book book;
    LocalDate orderDate;

    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.orderDate = LocalDate.of(year,month,day);
    }

    @Override
    public String toString() {
        return "Order created: " + orderDate + "\n" + "Book: " + book;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
