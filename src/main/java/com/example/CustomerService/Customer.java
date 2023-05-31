package com.example.CustomerService;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(
                columnNames = "email"
        )
)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "first name cannot be null")
    @NotEmpty(message = "first name cannot be empty")
    @Size(min = 3, max = 20, message = "first name must have at least 3 characters and less than 20")
    private String firstName;

    @NotNull(message = "last name cannot be null")
    @NotEmpty(message = "last name cannot be empty")
    @Size(min = 3, max = 20, message = "last name must have at least 3 characters and less than 20")
    private String lastName;

    @Pattern(regexp = "^\\d{9}$", message = "phone number must have exactly nine digits")
    private String phoneNumber;

    @NotNull(message = "email cannot be null")
    @NotEmpty(message = "email cannot be empty")
    @Email(message = "invalid email address")
    private String email;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private @Valid Event event;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private @Valid Menu menu;
}
