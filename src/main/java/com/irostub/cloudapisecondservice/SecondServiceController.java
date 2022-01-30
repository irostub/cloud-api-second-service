package com.irostub.cloudapisecondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/second")
public class SecondServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the second service";
    }

    @GetMapping("/header")
    public String header(@RequestHeader("second-request-header") String header) {
        log.info("Header: {}", header);
        return "second-request-header: " + header;
    }

    @GetMapping("/custom-filter")
    public String customFilter() {
        return "Hello from the second service";
    }
}
