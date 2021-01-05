package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {
	
	@GetMapping("/")
    public ResponseEntity<String> hello(){
        String msg = "Hello Docker World!";
        return ResponseEntity.ok(msg);
    }

    @GetMapping("/ping")
    public ResponseEntity ping() {
        return ResponseEntity.ok("pang");
    }

}
