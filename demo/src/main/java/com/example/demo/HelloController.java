package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public ResponseEntity<String> hello(){
        String msg = "Hello Spring MVC World!";
        return ResponseEntity.ok(msg);
    }

    @GetMapping("/demo/ping")
    public ResponseEntity ping() {
        return ResponseEntity.ok("pong");
    }
}
