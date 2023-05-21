package com.example.CustomerService;

import com.example.CustomerService.repository.CustomerRepository;
import com.example.CustomerService.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ApiController {


    private final CustomerRepository customerRepository;
    private final MenuRepository menuRepository;

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

    @GetMapping("/menu")
    public List<Menu> getMenu() {
        return menuRepository.findAll();
    }

    @PostMapping("/menu")
    public Menu createMenu(@RequestBody Menu menu) {
        return menuRepository.save(menu);
    }

    @DeleteMapping("/menu")
    public void deleteMenu(@RequestParam int id) {
        menuRepository.deleteById(id);
    }

}
