package no.borse.firstspringboot;

import org.springframework.stereotype.Component;

// NEEDS to be marked for Spring. If not, it will not be found.
// Can call it other ways:
/* @Bean
*  @Service
*  @Repository
*  They all are basically saying Component. */
@Component
public class PartsRepository {
}
