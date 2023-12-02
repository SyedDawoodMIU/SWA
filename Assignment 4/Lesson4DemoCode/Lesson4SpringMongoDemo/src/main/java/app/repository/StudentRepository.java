package app.repository;

import domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    @Query("{ 'phoneNumber' : ?0 }")
    Student findByPhoneNumber(String phoneNumber);

    @Query("{ 'address.city' : ?0 }")
    List<Student> findByCity(String city);
}
