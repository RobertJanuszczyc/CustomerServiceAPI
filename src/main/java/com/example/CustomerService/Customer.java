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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id",
    referencedColumnName = "id")
    private Event event;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_id",
            referencedColumnName = "id")
    private Menu menu;
}
