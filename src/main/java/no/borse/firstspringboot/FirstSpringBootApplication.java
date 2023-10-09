package no.borse.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Annotations: Tie into Java reflections.
* A way for Java to look at its own running code, while it is running.
*  */

@ActiveProfiles("test")
@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootApplication.class, args);
    }

}
