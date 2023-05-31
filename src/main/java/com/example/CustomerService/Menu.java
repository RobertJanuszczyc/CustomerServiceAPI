package com.example.CustomerService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "menu name cannot be null")
    @NotEmpty(message = "menu name cannot be empty")
    private String name;

    @NotNull(message = "description cannot be null")
    @NotEmpty(message = "description name cannot be empty")
    private String description;

    @Min(value = 50, message = "price has to be bigger than 50")
    private double price;
}
