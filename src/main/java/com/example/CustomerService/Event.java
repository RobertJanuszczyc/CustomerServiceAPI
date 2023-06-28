package com.example.CustomerService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull (message = "event name cannot be null")
    @NotEmpty(message = "event name cannot be empty")
    private String name;

    @Min(value = 50, message = "minimum number of people can be 50")
    @Max(value = 180, message = "maximum number of people can be 180")
    private int qtyPeople;
}
