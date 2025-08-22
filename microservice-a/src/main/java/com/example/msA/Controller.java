
package com.example.msA;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @GetMapping("/call-b")
    public String callB() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://microservice-b:8080/hello", String.class);
        ////        String response = restTemplate.getForObject("http://localhost:8080/hello", String.class);
        return "Response from B: " + response;
    }
}
