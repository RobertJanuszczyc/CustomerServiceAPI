package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private double price;

    @OneToMany (
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "menu_id",
            referencedColumnName = "id"
    )
    private List<Customer> customers;
}
