package hello;


        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.domain.EntityScan;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
        import org.springframework.stereotype.Repository;

@SpringBootApplication
@ComponentScan ({"hello.controller","hello.service","hello.repository"})
@EnableJpaRepositories({"hello.repository"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}