
package com.example.msB;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Microservice B!";
    }
}
