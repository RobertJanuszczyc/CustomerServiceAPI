package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "event_id")
    private Long eventId;
    private String eventName;
    private int qtyPeople;

}
