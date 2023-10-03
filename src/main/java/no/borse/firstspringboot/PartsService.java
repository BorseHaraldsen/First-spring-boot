package no.borse.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartsService {


    // Handles it for you.
    @Autowired
    private PartsRepository partsRepository;

}
