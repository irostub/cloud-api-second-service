package com.irostub.cloudapisecondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the second service";
    }
}
