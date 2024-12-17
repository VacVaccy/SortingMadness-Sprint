package pl.put.poznan.sorter.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = {"pl.put.poznan.sorter"})
public class SortingMadnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortingMadnessApplication.class, args);
        log.warn("App started (SL4FJ)");
    }
}
