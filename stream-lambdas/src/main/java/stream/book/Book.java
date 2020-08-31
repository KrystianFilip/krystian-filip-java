package stream.book;

import java.util.Objects;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final int signature;

    public Book(String author, String title, int yearOfPublication, final int signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication &&
                signature == book.signature &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfPublication, signature);
    }

    @Override
    public String toString() {
        return author + " " + title + "(" + yearOfPublication + ") -S#" + signature;
    }
}
