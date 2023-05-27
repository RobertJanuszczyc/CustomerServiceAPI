package com.example.CustomerService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private int id;


    private String name;
    private String description;
    private double price;




}
