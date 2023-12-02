import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    private Map<String, Book> bookStore = new HashMap<>();

    public void addBook(Book book) {
        bookStore.put(book.getIsbn(), book);
    }

    public Book getBook(String isbn) {
        return bookStore.get(isbn);
    }

    public Map<String, Book> getAllBooks() {
        return bookStore;
    }

    public void updateBook(Book book) {
        bookStore.put(book.getIsbn(), book);
    }

    public void deleteBook(String isbn) {
        bookStore.remove(isbn);
    }
}
