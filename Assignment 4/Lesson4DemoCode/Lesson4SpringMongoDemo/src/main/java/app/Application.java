package app;

import domain.Address;
import domain.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.repository.StudentRepository;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

        @Autowired
        private StudentRepository studentRepository;

        public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
                studentRepository.save(new Student("Bob1", "3333543210", "bob1@example.com",
                                new Address("1 Kaliste Saloom Road", "Lafayette", "70508")));
                studentRepository.save(new Student("Bob2", "4444543210", "bob2@example.com",
                                new Address("2 Kaliste Saloom Road", "Lafayette", "70508")));
                studentRepository.save(new Student("Bob3", "5555543210", "bob3@example.com",
                                new Address("3 Kaliste Saloom Road", "Lafayette", "70508")));
                studentRepository.save(new Student("Bob4", "7777543210", "bob4@example.com",
                                new Address("4 Kaliste Saloom Road", "Lafayette", "70508")));
                studentRepository.save(new Student("Bob5", "4532543210", "bob5@example.com",
                                new Address("5 Kaliste Saloom Road", "Lafayette", "70508")));

                System.out.println("All Students: " + studentRepository.findAll());
                System.out.println("Students named Bob1: " + studentRepository.findByName("Bob1"));
                System.out
                                .println("Student with phone number 4444543210: "
                                                + studentRepository.findByPhoneNumber("1234567890"));
                System.out.println("Students from Lafayette: " + studentRepository.findByCity("Lafayette"));

        }

}
