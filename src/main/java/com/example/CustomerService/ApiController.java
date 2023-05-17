package com.example.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

}
