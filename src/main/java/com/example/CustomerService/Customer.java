package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
