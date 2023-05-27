package com.example.CustomerService;

import jakarta.persistence.*;
import lombok.Data;




@Data
@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(
                name = "uniqueEmail",
                columnNames = "email"
        )
)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    @Column(
            nullable = false
    )
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_name",
    referencedColumnName = "eventName")
    private Event event;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_name",
            referencedColumnName = "name")
    private Menu menu;
}
