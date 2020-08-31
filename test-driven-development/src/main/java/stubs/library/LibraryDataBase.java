package stubs.library;

import java.util.List;

public interface LibraryDataBase {
    List<Book> listBooksByPartialTitle(String partialTitle);
    List<Book> listBooksByBorrowerName(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser,Book book);

    int returnBooks(LibraryUser libraryUser);
}
