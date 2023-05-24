package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private String eventName;
    private int qtyPeople;

}
