package com.example.CustomerService;

import com.example.CustomerService.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ApiController {


    private final CustomerRepository customerRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping("/customers")
    public void deleteCustomer(@RequestParam Long id) {
        customerRepository.deleteById(id);
    }

}
