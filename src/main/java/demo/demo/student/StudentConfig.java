package demo.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alvin = new Student(
                "alvin",
                "alvin@mail.com",
                LocalDate.of(2000, 1, 1)
            );

            Student alex = new Student(
                "alex",
                "alex@mail.com",
                LocalDate.of(2001, 2, 2)
            );

            Student kingwa = new Student(
                "kingwa",
                "kingwa@mail.com",
                LocalDate.of(2002, 3, 3)
            );

            repository.saveAll(List.of(alvin, alex, kingwa));
        };
    }
}
