package com.example.springboot.service;

import java.util.random.RandomGenerator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public Long randomNumber() {
        return RandomGenerator.getDefault().nextLong();
    }
}
