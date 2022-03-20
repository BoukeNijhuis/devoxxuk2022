package devoxxuk2022;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld(@RequestParam(name = "name", required = false) String name) {
        return handleRequest(name);
    }

    private String handleRequest(String name) {
        if (name == null || name.length() == 0) {
            name = "World";
        }

        return String.format("Hello %s!", name);
    }
}
