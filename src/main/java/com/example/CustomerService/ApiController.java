package com.example.CustomerService;

import com.example.CustomerService.repository.CustomerRepository;
import com.example.CustomerService.repository.EventRepository;
import com.example.CustomerService.repository.MenuRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Validated
public class ApiController {

    private final CustomerRepository customerRepository;
    private final MenuRepository menuRepository;
    private final EventRepository eventRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("/customers")
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
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
    public Menu createMenu(@RequestBody @Valid Menu menu) {
        return menuRepository.save(menu);
    }

    @DeleteMapping("/menu")
    public void deleteMenu(@RequestParam long id) {
        menuRepository.deleteById(id);
    }

    @GetMapping("/event")
    public List<Event> getEvent() {
        return eventRepository.findAll();
    }

    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }

    @DeleteMapping("/event")
    public void deleteEvent(@RequestParam long id) {
        eventRepository.deleteById(id);
    }
}
