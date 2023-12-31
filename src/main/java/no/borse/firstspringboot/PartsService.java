package no.borse.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService {


    // Handles it for you.
    @Autowired
    private  PartsRepository partsRepository;

    public  List<Part> getPart() {
        return partsRepository.getParts();

    }

    public void addPart(Part part) {
        partsRepository.addParts(part);
    }

}
