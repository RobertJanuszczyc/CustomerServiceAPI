package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_id")
    private int menuId;
    private String name;
    private String description;
    private double price;



}
