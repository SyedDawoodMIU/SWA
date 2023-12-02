import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    EmailSender emailSender;
    @Autowired
    JmsSender jmsSender;

    public void addBook(Book book) {
        bookRepository.addBook(book);
        emailSender.sendEmail("Syed.MuhammadDawoodShah@miu.edu", "Please read" + book.getTitle());
        jmsSender.sendMessage(book);
    }

    public Book getBook(String isbn) {
        return bookRepository.getBook(isbn);
    }

    public Map<String, Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public void updateBook(Book book) {
        bookRepository.updateBook(book);
    }

    public void deleteBook(String isbn) {
        bookRepository.deleteBook(isbn);
    }
}
