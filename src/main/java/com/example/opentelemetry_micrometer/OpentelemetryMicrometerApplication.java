package com.example.opentelemetry_micrometer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OpentelemetryMicrometerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpentelemetryMicrometerApplication.class, args);
    }

}

@RestController
class Controller {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping
    void get() {
        log.info("Get method invoked");
    }
}
