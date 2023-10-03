package no.borse.firstspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Letting Spring know to treat this class as a RestController. Do whatever you do to RestControllers.
@RestController
// I am a rest-controller = servlet. Map the root path where we wish to take requests on.
@RequestMapping("/api")
public class PartsController {

    //Make a get-request.
    @GetMapping()
    public String getHello() {
        return "Hello";
    }

}
