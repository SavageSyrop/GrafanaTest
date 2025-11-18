package ru.grafana;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Slf4j
@SpringBootApplication(scanBasePackages = "ru.grafana")
public class Application {
    public static void main(String[] args) {
//        log.info("Application stated!");
        SpringApplication.run(Application.class, args);
    }
}
