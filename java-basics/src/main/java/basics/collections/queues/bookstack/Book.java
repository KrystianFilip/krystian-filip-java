package basics.collections.queues.bookstack;

public class Book {
    String title;
    String author;
    int year;

    public Book(String author, String title, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return author + " - " + title + "(" + year + ")";
    }
}
