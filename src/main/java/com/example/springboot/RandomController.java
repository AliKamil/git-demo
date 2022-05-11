//package com.example.springboot;
//
//import com.example.springboot.service.HelloService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RandomController {
//
//    HelloService helloService;
//
//    public RandomController(HelloService helloService) {
//        this.helloService = helloService;
//    }
//
//
//    @GetMapping("/random")
//    public String index() {
//        return "Random number of the day is " + helloService.randomNumber();
//    }
//
//}