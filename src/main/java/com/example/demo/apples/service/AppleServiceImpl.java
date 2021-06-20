package com.example.demo.apples.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AppleServiceImpl implements AppleService {
    @Override
    public List<String> getAllAppleNames() {
        System.out.println("Running from service");
        return Arrays.asList("Alponso", "Amarapalli");
    }
}
