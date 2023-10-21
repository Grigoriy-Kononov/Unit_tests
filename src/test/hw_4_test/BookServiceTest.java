package test.hw_4_test;

import main.hw_4.Book;
import main.hw_4.BookRepository;
import main.hw_4.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Test
    public void testGetAllBooks() {
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        List<Book> expectedBooks = Arrays.asList(
                new Book(1, "Book 1", "Author 1"),
                new Book(2, "Book 2", "Author 2")
        );

        // Настраиваем поведение мок-объекта BookRepository
        when(bookRepository.getAllBooks()).thenReturn(expectedBooks);

        // Вызываем метод getAllBooks() у экземпляра BookService
        List<Book> actualBooks = bookService.getAllBooks();

        // Проверяем, что полученный результат соответствует ожидаемому
        assertEquals(expectedBooks, actualBooks);

        // Проверяем, что метод getAllBooks() был вызван у мок-объекта BookRepository
        verify(bookRepository, times(1)).getAllBooks();
    }

    @Test
    public void testGetBookById() {
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book expectedBook = new Book(1, "Book 1", "Author 1");
        when(bookRepository.getBookById(1)).thenReturn(expectedBook);
        Book actualBook = bookService.getBookById(1);
        assertEquals(expectedBook, actualBook);

        // Проверяем, что метод getBookById() был вызван у мок-объекта BookRepository с аргументом 1
        verify(bookRepository, times(1)).getBookById(1);
    }
}
