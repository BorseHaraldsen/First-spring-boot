package no.borse.firstspringboot;

import lombok.extern.flogger.Flogger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

// NEEDS to be marked for Spring. If not, it will not be found.
// Can call it other ways:
/* @Bean
*  @Service
*  @Repository
*  They all are basically saying Component. */
@Component
public class PartsRepository {


    // dummy commit

    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository() {
        parts.add(new Part("gear"));
        parts.add(new Part("cog"));
    }


    public ArrayList<Part> getParts() {
        return parts;
    }

    public void addParts(Part part) {
        parts.add(part);
    }
}
