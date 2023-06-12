package com.example.CustomerService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Dish {
    @Id
    @GeneratedValue
    private long id;
    @NotEmpty
    @NotNull
    private String name;
    @NotEmpty
    @Min(5)
    private double price;

}
