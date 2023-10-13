package no.borse.firstspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private  final Logger log = LoggerFactory.getLogger(PartsRepository.class);
    private ArrayList<Part> parts = new ArrayList<>();

    public PartsRepository() {
        parts.add(new Part("gear"));
        parts.add(new Part("cog"));
    }


    public ArrayList<Part> getParts() {
        return parts;
    }

    public void addParts(Part part) {
        if(part.name().equals("fish")) throw new AddPartsException();
        parts.add(part);
    }

    public void deletePart(Part part) {
        try{
            parts.remove(part);
        }catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
