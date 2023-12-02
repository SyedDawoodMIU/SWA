import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {
    @Autowired
    private RestOperations restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String serverUrl = "http://localhost:8080";

        Book book1 = new Book();
        book1.setIsbn("123456789");
        book1.setAuthor("Syed Dawood");
        book1.setTitle("SWA BOOK");
        book1.setPrice(25);

        restTemplate.postForLocation(serverUrl + "/addBook", book1);

        Book retrievedBook = restTemplate.getForObject(serverUrl + "/getBook/{isbn}", Book.class, "123456789");
        System.out.println("----------- Get Book By ISBN -----------------------");
        System.out.println(retrievedBook);

        Map<String, Book> allBooks = restTemplate.getForObject(serverUrl + "/getAllBooks", Map.class);
        System.out.println("----------- Get All Books -----------------------");
        System.out.println(allBooks);

        book1.setPrice(22);
        restTemplate.put(serverUrl + "/updateBook", book1);

        restTemplate.delete(serverUrl + "/deleteBook/{isbn}", "123456789");
    }

    @Bean
    RestOperations restTemplate() {
        return new RestTemplate();
    }
}
