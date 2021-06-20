package com.example.demo.apples.controller;

import com.example.demo.apples.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/apple")
public class AppleRestResource {

    Map<String, String> dataMap = new HashMap<>();

    @Autowired
    private AppleService appleService;

    @GetMapping
    public ResponseEntity<String> getTotalAppleCount() {
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<String>> getAllAppleNames() {
        return new ResponseEntity<>(appleService.getAllAppleNames(), HttpStatus.OK);
    }

    @PostMapping
    public String createNewApple(@RequestBody String name) {
        dataMap.put(name, name + "__" + new Date());
        return name;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getSpecificAppleNames(@PathVariable(value = "id") String id) {
        return new ResponseEntity<>(dataMap.get(id), HttpStatus.OK);
    }

}
