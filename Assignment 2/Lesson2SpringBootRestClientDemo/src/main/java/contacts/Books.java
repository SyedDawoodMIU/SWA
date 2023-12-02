import java.util.Collection;
import java.util.Map;

public class Books {
    private Map<String, Book> books;

    public Books() {
    }

    public Books(Map<String, Book> books) {
        this.books = books;
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<String, Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Books{" +
                "books=" + books +
                '}';
    }
}
