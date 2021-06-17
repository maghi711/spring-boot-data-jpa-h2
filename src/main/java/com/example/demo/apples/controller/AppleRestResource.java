package com.example.demo.apples.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apple")
public class AppleRestResource {

    @GetMapping
    public ResponseEntity<String> getTotalAppleCount() {
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }
}
