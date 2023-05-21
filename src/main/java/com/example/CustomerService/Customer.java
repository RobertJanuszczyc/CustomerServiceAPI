package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
