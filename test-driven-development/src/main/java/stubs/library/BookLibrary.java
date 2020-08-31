package stubs.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDataBase libraryDataBase;

    public BookLibrary(LibraryDataBase libraryDataBase) {
        this.libraryDataBase = libraryDataBase;
    }

    public List<Book> listBooksByPartialTitle(String partialTitle) {
        List<Book> bookList = new ArrayList<>();
        if (partialTitle.length() < 3) return bookList;
        List<Book> resultList = libraryDataBase.listBooksByPartialTitle(partialTitle);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksByBorrowerName(LibraryUser libraryUser) {
        List<Book> bookList = libraryDataBase.listBooksByBorrowerName(libraryUser);
        return bookList;
    }

}
