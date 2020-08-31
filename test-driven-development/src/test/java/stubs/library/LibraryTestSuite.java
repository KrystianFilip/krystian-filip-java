package stubs.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class LibraryTestSuite {

    LibraryDataBase libraryDataBaseMock;
    BookLibrary bookLibrary;
    public static int testCounter = 0;

    private List<Book> generateNNumberOfBooks(int booksQty) {
        List<Book> resultList = new ArrayList<>();
        for(int n=1;n<=booksQty;n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Starting test #" + testCounter);
        libraryDataBaseMock = mock(LibraryDataBase.class);
        bookLibrary = new BookLibrary(libraryDataBaseMock);
    }
    @Test
    public void testListBooksByPartialTitle() {
        //given
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Secrets of Alamo", "John Smith", 2008));
        bookList.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        bookList.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        bookList.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));
        when(libraryDataBaseMock.listBooksByPartialTitle("Secret")).thenReturn(bookList);
        //when
        List<Book> resultOfStubbing = bookLibrary.listBooksByPartialTitle("Secret");
        //then
        Assert.assertEquals(resultOfStubbing.size(),4);
    }
    @Test
    public void testListBooksByPartialTitleWith20Exemplars() {
        //given
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateNNumberOfBooks(15);
        List<Book> resultListOf40Books = generateNNumberOfBooks(40);
        when(libraryDataBaseMock.listBooksByPartialTitle(anyString())).thenReturn(resultListOf15Books);
        when(libraryDataBaseMock.listBooksByPartialTitle("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDataBaseMock.listBooksByPartialTitle("FortyBooks")).thenReturn(resultListOf40Books);
        //when
        List<Book> result1 = bookLibrary.listBooksByPartialTitle("ZeroBooks");
        List<Book> result2 = bookLibrary.listBooksByPartialTitle("AnyTitle");
        List<Book> result3 = bookLibrary.listBooksByPartialTitle("FortyBooks");
        //then
        Assert.assertEquals(result1.size(),0);
        Assert.assertEquals(result2.size(),15);
        Assert.assertEquals(result3.size(), 0);
    }
    @Test
    public void testListBooksByPartialTitleWithFragmentShorterThan3Letters() {
        //given
        List<Book> resultListOf10Books = generateNNumberOfBooks(10);
        when(libraryDataBaseMock.listBooksByPartialTitle(anyString())).thenReturn(resultListOf10Books);
        //when
        List<Book> theListOf10Books = bookLibrary.listBooksByPartialTitle("An");
        //then
        Assert.assertEquals(0,theListOf10Books.size());
        verify(libraryDataBaseMock,times(0)).listBooksByPartialTitle(anyString());
    }
    @Test
    public void testListBooksByBorrowerNameWithNoBooksBorrowed() {
        //given
        List<Book> resultListOf0Books = new ArrayList<>();
        LibraryUser krystek = new LibraryUser("Krystian", "filip", "23010132344");
        when(libraryDataBaseMock.listBooksByBorrowerName(krystek)).thenReturn(resultListOf0Books);
        //when
        List<Book> resultList = bookLibrary.listBooksByBorrowerName(krystek);
        //then
        Assert.assertEquals(resultList.size(),0);

    }
    @Test
    public void testListBooksByBorrowerNameWithOneBook() {
        //given
        List<Book> resultListOf1Book = generateNNumberOfBooks(1);
        LibraryUser michael = new LibraryUser("Michael","Gianno","23454512345");
        when(libraryDataBaseMock.listBooksByBorrowerName(michael)).thenReturn(resultListOf1Book);
        //when
        List<Book> resultList = bookLibrary.listBooksByBorrowerName(michael);
        //then
        Assert.assertEquals(resultList.size(),1);
    }
    @Test
    public void testListBooksByBorrowerNameWithFiveBooks() {
        //given
        List<Book> resultListOf5Books = generateNNumberOfBooks(5);
        LibraryUser jola = new LibraryUser("Jolanta","Shane", "23432312344");
        when(libraryDataBaseMock.listBooksByBorrowerName(jola)).thenReturn(resultListOf5Books);
        //when
        List<Book> resultList = bookLibrary.listBooksByBorrowerName(jola);
        //then
        Assert.assertEquals(resultList.size(),5);
    }
}
