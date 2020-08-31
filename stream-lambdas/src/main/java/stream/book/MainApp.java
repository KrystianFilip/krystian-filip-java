package stream.book;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        BookDirectory directory = new BookDirectory();
        List<Book> resultList = directory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("#elements: " + resultList.size());
        resultList.stream()
                .forEach(System.out::println);
        System.out.println();

        Map<Integer, Book> resultMap = directory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("#elements: " + resultMap.size());
        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
        System.out.println();

        String resultStringOfBooks = directory.getTheBookList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(resultStringOfBooks);
    }

}
