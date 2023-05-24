package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String eventName;
    private int qtyPeople;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "event_id",
            referencedColumnName = "id"
    )
    private List<Customer> customers;

}
