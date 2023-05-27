package com.example.CustomerService;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
    @NotNull(message = "first name cannot be a null")
    private String firstName;
    @NotNull(message = "last name cannot be a null")
    private String lastName;
    @Pattern(regexp = "^\\d{10}$" , message = "phone number must have exactly nine digits")
    private String phoneNumber;
    @Column(
            nullable = false
    )

    @Email(message = "invalid email address")
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
