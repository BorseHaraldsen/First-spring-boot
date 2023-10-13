package no.borse.firstspringboot;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Letting Spring know to treat this class as a RestController. Do whatever you do to RestControllers.
@RestController
// I am a rest-controller = servlet. Map the root path where we wish to take requests on.
@RequestMapping("/api/parts")
@Slf4j
public class PartsController {

    @Autowired
    private PartsService partsService;

    @Value("${borse.happyWord}")
    private String happyWord;

    //Make a get-request.
    /*@GetMapping()
    public String getHello() {
        return "Hello";
    }
    */
    @GetMapping()
        public ResponseEntity<List<Part>> getParts(){
        System.out.println(happyWord);
        return ResponseEntity.ok(partsService.getPart());
    }

    @PostMapping()

        // Instead of void - Make it ResponseEntity.
        public void addPart(@RequestBody Part part) {
        partsService.addPart(part);
    }


}
