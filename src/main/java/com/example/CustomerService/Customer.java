package com.example.CustomerService;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "first name cannot be null")
    @Size(min = 3, max = 20, message = "first name must have at least 3 characters and less than 20")
    private String firstName;
    @NotNull(message = "last name cannot be null")
    @Size(min = 3, max = 20, message = "last name must have at least 3 characters and less than 20")
    private String lastName;

    @Pattern(regexp = "^\\d{10}$", message = "phone number must have exactly nine digits")
    private String phoneNumber;

    @Column(
            nullable = false
    )
    @NotNull(message = "email cannot be null")
    @Email(message = "invalid email address")
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_name",
            referencedColumnName = "eventName")
    @Valid
    private Event event;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu_name",
            referencedColumnName = "name")
    @Valid
    private Menu menu;


}
